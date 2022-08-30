package customer_care;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InquiryDButil {
	
	
	static String url = "jdbc:mysql://localhost:3306/customer_care"; //database url
	static String user = "root"; //db user anme
	static String pass = "15775"; //db password
	
	public static List<Inquiry> addinquiry(){
		ArrayList<Inquiry> inq = new ArrayList<>();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			//get connection
			Connection con = DriverManager.getConnection(url, user, pass);
			//creats a statement
			Statement stm = con.createStatement();
		
		String sql1 = "SELECT * FROM inquiry";
		ResultSet rs = stm.executeQuery(sql1);
		 
		 while(rs.next()) {
			 String id = rs.getString(1);
			 String cid = rs.getString(2);
			 String fid = rs.getString(3);
			 String sta = rs.getString(4);
			 
			 Inquiry iq = new Inquiry(id, cid, fid, sta);
			 inq.add(iq);
		 }
		
		 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return inq;
	}
	
	public static boolean updateinquiry(String inqid, String  cusid, String feedbid, String status) {
		boolean isSuccess = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//get connection
			Connection con = DriverManager.getConnection(url, user, pass);
			//creats a statement
			Statement stm = con.createStatement();
			String sql = "update inquiry set cusid = '"+cusid+"', feedid = '"+feedbid+"', status = '"+status+"'"
					+"where id='"+inqid+"'";
			
			//ResultSet rs = stm.executeQuery(sql);
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
	
	public static boolean deletenquiry(String inqid) {
		boolean isSuccess = false;
		int convid = Integer.parseInt(inqid);
		try {
		Class.forName("com.mysql.jdbc.Driver");
		//get connection
		Connection con = DriverManager.getConnection(url, user, pass);
		//creats a statement
		Statement stm = con.createStatement();
		String sql = "delete from inquiry where id= '"+convid+"'";
		int r = stm.executeUpdate(sql);
		if(r > 0) {
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
