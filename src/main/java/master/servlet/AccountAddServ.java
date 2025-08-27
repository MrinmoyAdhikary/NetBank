package master.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import master.dao.AccountDao;
import master.dao.CustomerDao;
import master.dto.AccountDto;
import master.dto.CustomerDto;

import java.io.IOException;
import java.sql.Date;

/**
 * Servlet implementation class AccountAddServ
 */
@WebServlet("/AccountAddServ")
public class AccountAddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		   int accno = Integer.parseInt(request.getParameter("accno"));
	        String openDateStr = request.getParameter("opendate");
	        double balance = Double.parseDouble(request.getParameter("balance"));
	        String accountType = request.getParameter("accounttype");
	        String cid = request.getParameter("cid");

	     
	        Date opendate = Date.valueOf(openDateStr);
	        

	    
	        AccountDto adto = new AccountDto();
	        adto.setAccno(accno);
	        adto.setOpendate(opendate);
	        adto.setBalance(balance);
	        adto.setAccounttype(accountType);
	        adto.setCid(cid);

	        
	        AccountDao dao = new AccountDao();
	        dao.insertData(adto);
	     

            request.setAttribute("msg", "Account added successfully!,Account Number:"+accno);
	       
	        request.getRequestDispatcher("AccountDetails.jsp").forward(request, response);
	}

}
