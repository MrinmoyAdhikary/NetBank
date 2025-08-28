package master.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import master.dto.AccountDto;
import master.dto.CustomerDto;
import master.utilities.ConnectionFactory;

public class AccountDao {
    private Connection cn = null;
    private PreparedStatement ps = null;


    private String insert_sql = "INSERT INTO account VALUES (?,?,?,?,?)";
  
    private String update_sql="update account set balance=?  where accno=?";


    public boolean insertData(AccountDto adto) {
               try {
            ConnectionFactory con = new ConnectionFactory();
            cn = con.getConn();

            ps = cn.prepareStatement(insert_sql);
            ps.setInt(1, adto.getAccno());
            ps.setDate(2, adto.getOpendate());
            ps.setDouble(3, adto.getBalance());
            ps.setString(4, adto.getAccounttype());
            ps.setString(5, adto.getCid());

        	int rows=ps.executeUpdate();
            if(rows>0)
            	return true;
    		}
    		
    	
    		catch(SQLException se)
    		{
    			se.printStackTrace();
    		}
    		return false;
    }
    public boolean updateData(AccountDto adto)
	{
		try
		{
		
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(update_sql);
		 ps.setDouble(1,adto.getBalance());
		ps.setInt(2,adto.getAccno());
		int rows=ps.executeUpdate();
        if(rows>0)
        	return true;
		}
		
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return false;
	}
 
}

