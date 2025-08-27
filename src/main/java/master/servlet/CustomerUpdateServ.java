package master.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import master.dao.CustomerDao;
import master.dto.CustomerDto;

import java.io.IOException;

/**
 * Servlet implementation class CustomerUpdateServ
 */
@WebServlet("/CustomerUpdateServ")
public class CustomerUpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		String cemail=request.getParameter("cemail");
		String cphno=request.getParameter("cphno");
		
		
		CustomerDto cdto=new CustomerDto();
		cdto.setCid(cid);
		cdto.setCphno(cphno);
		cdto.setCemail(cemail);
		CustomerDao cdao=new CustomerDao();
		cdao.updateData(cdto);
		   request.setAttribute("msg", "Customer updated successfully!,CID:"+cid);
	        
	        request.getRequestDispatcher("CustomerDetails.jsp").forward(request, response);
	}

}
