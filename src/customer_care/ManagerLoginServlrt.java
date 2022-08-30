package customer_care;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class ManagerLoginServlrt
 */
@WebServlet("/ManagerLoginServlrt")
public class ManagerLoginServlrt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = request.getParameter("muid"); //muid comming from Mangerlogin.jsp on name of the user-id
		String password = request.getParameter("mpass");
		
		try{
		List<Manager> Managerdetails = ManagerDButil.validate(username, password);
		request.setAttribute("Managerdetails", Managerdetails);
		}
		
		catch (Exception ex){
			System.out.println(ex);
		}
		//automatic revist to the useaccount.jsp for correct logins
		RequestDispatcher di = request.getRequestDispatcher("useraccount.jsp");
		di.forward(request, response);
		
	}

}
