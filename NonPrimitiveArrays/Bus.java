package NonPrimitiveArrays;
import java.util.Arrays;


public class Bus {
         String name, busNo, start, end, seatType, startTime, endTime;
         int distance;
         String[] boarding, drop;
         
         
         User[][] seats=new User[10][4];
         
         public Bus() { 
        	 
         }

		 public Bus(String name, String busNo, String start, String end, String seatType, String startTime,
				String endTime, int distance, String[] boarding, String[] drop, User[][] seats) {
			super();
			this.name = name;
			this.busNo = busNo;
			this.start = start;
			this.end = end;
			this.seatType = seatType;
			this.startTime = startTime;
			this.endTime = endTime;
			this.distance = distance;
			this.boarding = boarding;
			this.drop = drop;
			this.seats = seats;
		 
			System.out.println("Bus Registered");
		 }
		 public void displayBusDetails() {
			 System.out.println("Name"+name);
			 System.out.println("Bus Number: "+busNo);
			 System.out.println("Boarding: "+start);
			 System.out.println("Destination: "+end);
			 System.out.println("Seating Type: "+seatType);
			 System.out.println("Start Time:"+startTime);
			 System.out.println("Reach Time:"+endTime);
			 System.out.println("Boarding Points: "+Arrays.toString(boarding));
			 System.out.println("Drop Points: "+Arrays.toString(drop));
			 System.out.println("-----------------------------------------------------------------");
		 }
		 
		 public void showSeats() {
			 for (int i = 0; i < seats.length; i++) {
				 System.out.println(Arrays.toString(seats[i]));
					
				}
			 System.out.println("---------------------------------------------------------");
		}
		 
		 public boolean checkStartPoints(String boarding) {
			 for (int i = 0; i < this.boarding.length; i++) {
				 if(this.boarding[i].equals(boarding)) return true;
				}
			 return false;
		 }
		 
		 public boolean checkDropPoints(String drop) {
			 for (int i = 0; i < this.boarding.length; i++) {
				 if(this.drop[i].equals(drop)) return true;
				}
			 return false;
		 }
		 
		 public void bookSeat(String name, int age, long phno,char gen, String email,String boarding, 
				           String destination, char row, int seat, int seaters) {
			 int i=row-'A';
			 int j=seat-1;
			 if(seaters==1) {
			 if(row>='A' && row<='Z' && seat>0 && seat<=4) {
				 
				 if(seats[row-65][seat-1]==null) {
					 if(checkStartPoints(boarding)&&checkDropPoints(destination)) {
						 seats[row-65][seat-1]=new User(name, boarding, destination, email, gen, age, phno,seaters);
						 System.out.println("Seat Booked!");
					 }
					 else {
						 System.out.println("Invalid Start/ Drop Point");
					 }
				 }
				 else {
					 System.out.println("Seat is already Booked");
				 }
			 }
			 else {
				 System.out.println("Invalid Seat Number Entered");
			 }
		 }
			 else {
				 
			 }
		 }
		
		 
		 }
		 



























