package customer_care;

public class Feedback {
	private String id;
	private String username;
	private String number;
	private String catogory;
	private String detail;
	private String reference;
	
	public Feedback(String id, String username, String number, String catogory, String detail, String reference) {
		this.id = id;
		this.username = username;
		this.number = number;
		this.catogory= catogory;
		this.detail = detail;
		this.reference = reference;
	}
	
	public String getid(){
		return id;
	}
	public String getusername(){
		return username;
	}
	public String getnumber(){
		return number;
	}
	public String getcatogory(){
		return catogory;
	}
	public String getdetail(){
		return detail;
	}
	public String getreference(){
		return reference;
	}
}
