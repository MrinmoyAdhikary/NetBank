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
 * Servlet implementation class CustomerAddServ
 */
@WebServlet("/CustomerAddServ")
public class CustomerAddServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		String cname=request.getParameter("cname");
		String cemail=request.getParameter("cemail");
		String cphno=request.getParameter("cphno");
		String cpanno=request.getParameter("cpanno");
		String cadhar=request.getParameter("cadhar");
		
		CustomerDto cdto=new CustomerDto();
		cdto.setCid(cid);
		cdto.setCname(cname);
		cdto.setCphno(cphno);
		cdto.setCemail(cemail);
		cdto.setCpanno(cpanno);
		cdto.setCadhar(cadhar);
		CustomerDao cdao=new CustomerDao();
		cdao.insertData(cdto);
		   request.setAttribute("msg", "Customer added successfully!,CID:"+cid);
	        
	        // ✅ forward to showdetails.jsp
	        request.getRequestDispatcher("CustomerDetails.jsp").forward(request, response);
	}

}
