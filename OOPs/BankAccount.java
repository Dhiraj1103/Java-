package OOPs;
import java.util.*;

public class BankAccount {
	private String name, address, ifsc, branch, bankName;
	private long accNo, phnNo, aadhar;
	private int pin, balance;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	BankAccount(String name, String address, String ifsc, long accNo, long phnNo, long aadhar, int pin, String branch, String bankName,int balance){
		this.name=name;
		this.address=address;
		this.ifsc=ifsc;
		this.accNo=accNo;
		this.phnNo=phnNo;
        this.aadhar=aadhar;
        this.pin=pin;
        this.branch=branch;
        this.bankName=bankName;
        this.balance=balance;
	}
	
	public String getName() {
		return name;
	}
	public String getbankName() {
		return bankName;
	}
	public long getphnNo() {
		return phnNo;
	}
	public String getIfsc() {
		return ifsc;
	}
	public long getAccountNo() {
		return accNo;
	}
	public String getAddress() {
		return address;
	}
	public String getBranchName() {
		return branch;
	}
    public void setPin(long accNo,int oldPin, int newPin) {
    	if(this.accNo==accNo && this.pin==newPin) {
    		System.out.println("Pin already used Try another!!!!");
    	}
    	else if(this.accNo==accNo && this.pin==oldPin){
    		this.pin=newPin;
    		System.out.println("Pin updated Successfull");
    		
    	}
    	else {
    		System.out.println("Invalid Credential");
    	}
    }
     public long getAadhar() {
    	 return aadhar;
     }
     
     public int getBalance() {
    	 return balance;
     }
     
     public void creditAmount(int amt,int pin, long accNo) {
    	 if(this.accNo==accNo && this.pin==pin) {
    		 if(amt>0) {
    		 balance+=amt;
    		 System.out.println("Amount Credited Successfully");
    		 System.out.println("Your current Account Balance is: "+balance);
    		 }
    		 else {
    			 System.out.println("Invalid amount entered");
    		 }
    	 }
    	 else
    		 System.err.println("Invalid Credentials");
     }
     public void debitAmount(int amt,int pin, long accNo) {
    	 if(this.accNo==accNo && this.pin==pin) {
    		 if(amt>0 && amt<balance) {
    		 balance-=amt;
    		 System.out.println("Amount Debited Successfully");
    		 System.out.println("Your current Account Balance is: "+balance);
    		 }
    		 else {
    			 System.out.println("Insufficient Balance");
    		 }
    	 }
    	 else
    		 System.err.println("Invalid Credentials");
     }
     
 }

class BankDriver{
    
	
	
    public static void main(String[] args) {
    	BankAccount b1=new BankAccount("Dhiraj Shelke","Pune","ICICI1234",123456789l,7972066855l,8555456788l,2003,"Deccan","ICICI Bank",10000);
    	Scanner sc= new Scanner(System.in);
		for(;;) {
			System.out.println("------------Welcome to ICICI Bank------------");
			System.out.println("Please select the option from the above the fetch the user details");
			System.out.println("1. Username");
			System.out.println("2. IFSC code");
			System.out.println("3. Address");
			System.out.println("4. Account Number");
			System.out.println("5. Phone Number");
			System.out.println("6. Aadhar Number");
			System.out.println("7. Branch Name");
			System.out.println("8. Deposit Money");
			System.out.println("9. Withdraw Money");
			System.out.println("10. Check Balance");
			System.out.println("0. Exit");
			int op=sc.nextInt();
			
			switch(op) {
			case 1: System.out.println("UserName: "+b1.getName());
			break;
			
			case 2: System.out.println("IFSC Code: "+b1.getIfsc());
			break;
			
			case 3: System.out.println("User Address: "+b1.getAddress());
			break;
			
			case 4: System.out.println("Account Number: "+b1.getAccountNo());
			break;
			
			case 5: System.out.println("Phone Number: "+b1.getphnNo());
			break;
			
			case 6: System.out.println("Aadhar Number: "+b1.getAadhar());
			break;
			
			case 7: System.out.println("Branch Name: "+b1.getBranchName());
			break;
			
			case 8:{ 
				System.out.print("Enter Account number: ");
				int ac=sc.nextInt();
				System.out.print("Enter Pin: ");
				int pin=sc.nextInt();
				System.out.print("Enter Amount: ");
				int amt=sc.nextInt();
				
				b1.creditAmount(amt, pin, ac);
			break;
			}
			case 9:{ 
				System.out.print("Enter Account number: ");
				int ac=sc.nextInt();
				System.out.print("Enter Pin: ");
				int pin=sc.nextInt();
				System.out.print("Enter Amount: ");
				int amt=sc.nextInt();
				
				b1.debitAmount(amt, pin, ac);
			break;
			}
			
			case 10: System.out.println("Current Balance: "+b1.getBalance());
			break;
			
			case 0: {
				System.out.println("Thank you for Banking with us");
				System.exit(0);
			}
			}
			
			}
			

			
		}
	}

