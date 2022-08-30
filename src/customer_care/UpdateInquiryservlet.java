package customer_care;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateInquiryservlet
 */
@WebServlet("/UpdateInquiryservlet")
public class UpdateInquiryservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String inqid = request.getParameter("iid");
		String  cusid= request.getParameter("cid");
		String feedbid = request.getParameter("fid");
		String status = request.getParameter("sta");
		
		boolean isTrue;
		 isTrue = InquiryDButil.updateinquiry(inqid, cusid, feedbid, status);
		 if(isTrue == true) {
			 RequestDispatcher di = request.getRequestDispatcher("success.jsp");
				di.forward(request, response);
		 }
		 else {
			 RequestDispatcher di = request.getRequestDispatcher("unsuccess.jsp");
				di.forward(request, response); 
		 }
	}

}
