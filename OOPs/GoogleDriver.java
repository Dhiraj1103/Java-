package OOPs;

class Google{
	String ceo,hq, email, pass;
	double turnover;
	
	public Google() {
		// TODO Auto-generated constructor stub
	}
 public Google(String ceo, String hq, String email, String pass, double turnover) {
	 this.ceo = ceo;
	    this.hq = hq;
	    this.email = email;
	    this.pass = pass;
	    this.turnover = turnover;
	 }

  public void login(String email, String pass) {
	  if(this.email==email && this.pass==pass)
		  System.out.println("Login Successful");
	  else
		  System.out.println("Invalid Credentials");
  }
  public void displayGoogle(){
	  System.out.println("CEO of Google: "+ceo);
	  System.out.println("Headquarters of Google: "+hq);
	  System.out.println("Turnover of Google: "+turnover);
	  System.out.println("------------------------------------------");
  }
}
class Gmail extends Google{
	int mail, inbox, sent, bin;
	public Gmail() {
		// TODO Auto-generated constructor stub
	}
    public Gmail(String ceo, String hq, String email, String pass, double turnover) {
    	 this.ceo=ceo;
    	 this.email=email;
    	 this.hq=hq;
    	 this.pass=pass;
    	 this.turnover=turnover;
    }
    
    public void sendMail(String email, String content) {
    	System.out.println("Mail Sent!");
    	sent++;
    }
    public void recieveMail(String email, String content) {
    	System.out.println("Mail recieved from "+email);
    	inbox++;
    	mail++;
    }
    public void deleteMail(String email) {
    	mail--;
    	bin++;
    }
    
    public void displayGmail() {
    	System.out.println("Mails: "+mail);
    	System.out.println("Inbox: "+inbox);
    	System.out.println("Sent Mails: "+sent);
    	System.out.println("Deleted Mails: "+bin);
  }
}
 class GoogleDrive extends Google{
	 int photos,vid, docs, audio, bin;
	 public GoogleDrive() {
		// TODO Auto-generated constructor stub
	}
	 public GoogleDrive(String ceo, String hq, String email, String pass, double turnover) {
		 this.ceo=ceo;
    	 this.email=email;
    	 this.hq=hq;
    	 this.pass=pass;
    	 this.turnover=turnover;
	 }
	 public void addFiles(String fileType) {
		 switch(fileType) {
		 case "Photos":
		 case "photos":{
			 System.out.println("Photo added");
			 photos++;
		 }
		 break;
		 case "Video":
		 case "video":
		 case "videos":{
			 System.out.println("Video added");
			 vid++;
		 }
		 break;
		 case "Audio":
		 case "audio":{
			 System.out.println("Audio added");
			 audio++;
		 }
		 break;
		 case "docs":
		 case "Docs":{
			 System.out.println("Document added");
			 docs++;
		 }
		 break;
		 default: 
			 System.out.println("Invalid File type");
	 }
	}
	 public void delete(String fileType) {
		 switch(fileType) {
		 case "Photos":
		 case "photos":{
			 System.out.println("Photo deleted");
			 photos--;
			 bin++;
		 }
		 break;
		 case "Video":
		 case "video":
		 case "videos":{
			 System.out.println("Video deleted");
			 vid--;
			 bin++;

		 }
		 break;
		 case "Audio":
		 case "audio":{
			 System.out.println("Audio deleted");
			 audio--;
			 bin++;

		 }
		 break;
		 case "docs":
		 case "Docs":{
			 System.out.println("Document deleted");
			 docs--;
			 bin++;

		 }
		 break;
		 
		 default: 
			 System.out.println("Invalid File deleted");
	 }
	 }
		 
		 public void displayDrive() {
			 System.out.println("Photos: "+photos);
			 System.out.println("Videos: "+vid);
			 System.out.println("Documents: "+docs);
			 System.out.println("Audios: "+audio);
			 System.out.println("Bin: "+bin);

		 }
 }

public class GoogleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail g1=new Gmail("Sundar Pichai", "US", "dhiraj@gmail.com", "1234", 365465651615.0);
		g1.login("dhiraj@gmail.com", "1234");
	    g1.displayGoogle();
	    g1.sendMail("dhira@gmail.com","Hi");
	    g1.recieveMail("dhira@gmail.com", "Bye");
	   g1.deleteMail("dhiraj@gmail.com");
	    g1.displayGmail();
	    System.out.println("----------------------------------------------------------");
	    GoogleDrive g2=new GoogleDrive("Sundar Pichai", "US", "dhiraj@gmail.com", "1234", 365465651615.0);
           g2.addFiles("photos");
           g2.displayDrive();

	}

}
