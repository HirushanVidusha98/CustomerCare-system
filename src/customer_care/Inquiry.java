package customer_care;

public class Inquiry {
   private String id;
   private String cusid;
   private String feedid;
   private String status;
   
   public Inquiry(String id, String cusid, String feedid, String status) {
	   this.id = id;
	   this.cusid = cusid;
	   this.feedid = feedid;
	   this.status = status;
   }
   
   public String getid() {
	   return id;
   }
   public String getcusid() {
	   return cusid;
   }
   public String getfeedid() {
	   return feedid;
   }
   public String getstatus() {
	   return status;
   }
   
   
}
