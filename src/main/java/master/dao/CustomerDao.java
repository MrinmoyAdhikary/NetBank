package master.dao;
import java.sql.*;

import master.dto.CustomerDto;
import master.utilities.ConnectionFactory;

public class CustomerDao {
	private Connection cn=null;
	private Statement st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String insert_sql="insert into customer values(?,?,?,?,?,?)";
	private String update_sql="update customer set cemail=? ,cphno=? where cid=?";
	private String delete_sql="delete from customer where cid=?";
	
	public void insertData(CustomerDto cdto)
	{
		try
		{
		
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(insert_sql);
		    ps.setString(1,cdto.getCid());
		    ps.setString(2,cdto.getCname());
		    ps.setString(3,cdto.getCphno());
		    ps.setString(4,cdto.getCemail());
		    ps.setString(5,cdto.getCpanno());
		    ps.setString(6,cdto.getCadhar());
	
		 ps.executeUpdate();
		}
		
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void updateData(CustomerDto cdto)
	{
		try
		{
		
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(update_sql);
		 ps.setString(2,cdto.getCphno());
		ps.setString(1,cdto.getCemail());
		 ps.setString(3, cdto.getCid());  
		 ps.executeUpdate();
		}
		
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData(CustomerDto cdto)
	{
		try
		{
		
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
			ps=cn.prepareStatement(delete_sql);
		 ps.setString(1,cdto.getCid());
		
		 ps.executeUpdate();
		}
		
	
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}

}
