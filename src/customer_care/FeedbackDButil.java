package customer_care;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FeedbackDButil {
	static String url = "jdbc:mysql://localhost:3306/customer_care"; //database url
	static String user = "root"; //db user anme
	static String pass = "15775"; //db password
	
	public static List<Feedback> displayfeedback(){
		ArrayList<Feedback> fed = new ArrayList<>();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			//get connection
			Connection con = DriverManager.getConnection(url, user, pass);
			//creats a statement
			Statement stm = con.createStatement();
		
		String sql = "SELECT * FROM feedback";
		ResultSet rs = stm.executeQuery(sql);
		 
		 while(rs.next()) {
			 String id = rs.getString(1);
			 String uname = rs.getString(2);
			 String phone = rs.getString(3);
			 String catogtory = rs.getString(4);
			 String detail = rs.getString(5);
			 String refno = rs.getString(6);
			 
			 Feedback f = new Feedback(id, uname, phone, catogtory, detail, refno);
			 fed.add(f);
		 }
		
		 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return fed;
	}
}
