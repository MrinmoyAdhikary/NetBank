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

/**
 * Servlet implementation class CustomerUpdateServ
 */
@WebServlet("/AccountUpdateServ")
public class AccountUpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		double balance=Double.parseDouble(request.getParameter("balance"));
		int accno=Integer.parseInt(request.getParameter("accno"));
		
		
		AccountDto adto=new AccountDto();
		adto.setBalance(balance);
		adto.setAccno(accno);

		AccountDao adao=new AccountDao();
		boolean rs=adao.updateData(adto);
		if(rs)
		request.setAttribute("msg", "Account updated successfully!,Account Number:"+accno);
		else
			request.setAttribute("msg", "Account doesn't exist!,Account Number:"+accno);
        request.getRequestDispatcher("AccountDetails.jsp").forward(request, response);
	}

}

