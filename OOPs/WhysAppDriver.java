package OOPs;



interface WhysApp {
	int msgLimit=100;
	void message(long phno, String msg);
	void voiceMsg(long phno, String msg);
	
}

//----------------------------------------------------------------------------------------------
 class WhysApp1 implements WhysApp{
	 String user;
	 long phno;
	 int messageCount;
	 
	 public WhysApp1() {
		 
	 }
     public WhysApp1(String user, long phno) {
    	 this.user=user;
    	 this.phno=phno;
    	 System.out.println("Account Created");
     }
     
	 public void message(long phno, String msg) {
		 if(messageCount<=msgLimit) {
		 System.out.println(msg);
		 System.out.println("Message Sent!!!!");
		 messageCount++;
	 }
		 else {
			 System.out.println("Daily Limit Exceeded");
		 }
	 }
	 public void voiceMsg(long phno, String msg) {
		 if(messageCount<=msgLimit) {
			 System.out.println(msg);
			 System.out.println("Voice message sent");
			 messageCount++;
		 }
		 else {
			 System.out.println("Limit exceeded");
		 }
	 }
 }
 
 public class WhysAppDriver{
	 public static void main(String[] args) {
		WhysApp w=new WhysApp1("Dhiraj Shelke", 7972066855l);
		w.message(7972066855l, "Laudya");
		w.voiceMsg(7972066855l, "NIg Chal");
	}
 }