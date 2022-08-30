package customer_care;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static String url = "jdbc:mysql://localhost:3306/customer_care";
	private static String unerName = "root";
	private static String password = "15775";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, unerName, password);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
