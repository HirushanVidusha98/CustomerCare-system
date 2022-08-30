package customer_care;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteInquiryservlet
 */
@WebServlet("/DeleteInquiryservlet")
public class DeleteInquiryservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String inqid = request.getParameter("iid");
		
		boolean isTrue;
		 isTrue =  InquiryDButil.deletenquiry(inqid);
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
