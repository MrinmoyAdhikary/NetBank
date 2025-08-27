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
 * Servlet implementation class CustomerDelServ
 */
@WebServlet("/CustomerDelServ")
public class CustomerDelServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		
		CustomerDto cdto=new CustomerDto();
		cdto.setCid(cid);
		CustomerDao cdao=new CustomerDao();
		cdao.deleteData(cdto);
		cdao.insertData(cdto);
		   request.setAttribute("msg", "Customer deleted successfully!,CID:"+cid);
	        
	        request.getRequestDispatcher("CustomerDetails.jsp").forward(request, response);
	}

}
