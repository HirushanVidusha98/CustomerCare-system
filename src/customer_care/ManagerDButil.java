package customer_care;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ManagerDButil {
	
	private static Connection con = null;
	private static Statement stm = null;
	private static ResultSet rs = null;

public static List<Manager> validate(String ManageruserName, String Managerpassword) {
		
		ArrayList<Manager> man = new ArrayList<>();
		
		//create a database connection
	//	String url = "jdbc:mysql://localhost:3306/customer_care"; //database url
		//String user = "root"; //db user anme
		//String pass = "15775"; //db password
		
		//validate
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//get connection
			//Connection con = DriverManager.getConnection(url, user, pass);
			//creats a statement
			//Statement stm = con.createStatement();
			con = DBConnect.getConnection();
			stm = con.createStatement();
			
			//make my query
			String sql = "SELECT * FROM manager WHERE uname = '"+ManageruserName+"' AND password='"+Managerpassword+"'";
		     //username= database colum name
			 //MaanageruserName is parameter names of the validate methord 
			 
			// ResultSet rs = stm.executeQuery(sql);
			 rs = stm.executeQuery(sql);
			 if (rs.next()) {
			 int id = rs.getInt(1); //1 is colum indes of databse
				String name = rs.getString(2); 
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userM = rs.getString(5);
				String passM = rs.getString(6);
				
				//creat a manager type object and pass the values as parameters from Database
				Manager m = new Manager(id, name, email, phone, userM, passM);
				man.add(m);
			 }
				
			} catch (Exception ex) {
			 System.out.println(ex);
		}
		
		return man;	
}
public static boolean insertInquiry(String cusid, String feedid, String status) {
	boolean isSuccess = false;
	//creat db connection
	//String url = "jdbc:mysql://localhost:3306/customer_care"; //database url
	//String user = "root"; //db user anme
	//String pass = "15775"; //db password
	
	try {
		//Class.forName("com.mysql.jdbc.Driver");
		//get connection
		//Connection con = DriverManager.getConnection(url, user, pass);
		//creats a statement
		//Statement stm = con.createStatement();
		con = DBConnect.getConnection();
		stm = con.createStatement();
		
		String sql = "INSERT INTO inquiry values(0, '"+cusid+"', '"+feedid+"', '"+status+"')";
		int rs = stm.executeUpdate(sql);
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	
	return isSuccess;
}


 
}



