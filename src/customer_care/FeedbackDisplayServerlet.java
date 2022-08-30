package customer_care;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeedbackDisplayServerlet
 */
@WebServlet("/FeedbackDisplayServerlet")
public class FeedbackDisplayServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<Feedback> feeddetails = FeedbackDButil.displayfeedback();
			request.setAttribute("feeddetails", feeddetails);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		RequestDispatcher di = request.getRequestDispatcher("useraccount.jsp");
		di.forward(request, response);

	}

}
