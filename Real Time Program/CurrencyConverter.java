import java.util.Scanner;
class CurrencyConverter{
	public static void main(String[]args){

	  Scanner sc=new Scanner(System.in);
	  System.out.println("-----Currency Converter------");
	  System.out.println();
	    System.out.println("Convert you INR into below mentioned currency");
	  System.out.println("1. USD");
	   System.out.println("2. EUR");
	    System.out.println("3. JYP");
	     System.out.println("4. RUBLE");
	     System.out.println("5. RIYAL");

	     System.out.println();
	     System.out.print("Enter the country:");
	     String res= sc.next().toUpperCase();
	    
	     System.out.println();
	     float converted=0;
	    
	    switch(res){  //here we are not using break as the sop statement to enter the amount would be unreachable
	    case "USD":
	    case "EUR":
	    case "JYP":
	    case "RUBLE":
	    case "RIYAL":
	    	System.out.println("Enter the amonut: ");
	    	float inr=sc.nextFloat();
	    

       
        switch(res){
        case "USD":{
        	converted=inr/85.6299f;
        	break;
        }
        case "EUR":{
        	converted=inr/97.1036f;
            break;
        }
        case "JYP":{
    	converted=inr/0.5995f;
    	break;
    }
           case "RUBLE":{
    	converted=inr/1.0314f;
    	break;
    }
      case "RIYAL":{
    	converted=inr/23.5309f;
    	break;
    }
}
     System.out.println();
     System.out.println(inr + " INR = " + converted + " " + res);
     break;

     //first break statements default 
   default:
   	System.out.println("Invalid Currency");
   	break;
        

     

       }
	}
}
