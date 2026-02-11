package OOPs;

import java.util.*;

class BankingProgram {
    static String name; 
    static String email;  
    static String address;   
    static String contact;   
    static String panCard;   
    static String ifscCode = "LCF0009211";
    static float bal;  
    static int pin;   
    static long aadhar;   
    static long accountNumber = 1234_1234_1234L;
    static ArrayList <String> statement =new ArrayList <String> ();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        welcomeLoop:
        for (;;) {
            System.out.println();
            System.out.println("*****Welcome******");
            System.out.println("**Laxmi Chit Fund**");
            System.out.println();
            System.out.println("1. Create Account");
            System.out.println("2. Existing User");
            System.out.println();
            System.out.print("Enter the option: ");

            switch (sc.nextInt()) {
                case 1: {
                    System.out.println();
                    System.out.println("******Create Account******");
                    sc.nextLine(); // Clear buffer
                    System.out.print("Username: ");
                    name = sc.nextLine();
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    System.out.print("Address: ");
                    address = sc.nextLine();
                    System.out.print("Contact Details: ");
                    contact = sc.nextLine();
                    System.out.print("PanCard Details: ");
                    panCard = sc.nextLine();
                    System.out.print("Aadhar Details: ");
                    aadhar = sc.nextLong();
                    System.out.print("Pin: ");
                    pin = sc.nextInt();
                    System.out.print("Enter the amount to be deposited: ");
                    bal = sc.nextFloat();
                    statement.add("Deposit: "+bal+"Rs  (Account Creation)");
                    System.out.println();
                    System.out.println("Account Created Successfully");
                    System.out.println();
                    break;/// from here it would again go to main page
                }

                case 2: {
                    if (name == null) {
                        System.out.println();
                        System.out.println("Create your Account First");
                        break;
                    }
                   
                   //after breaking from first switch
                    System.out.println();
                    System.out.println("*****Login Page*****");

                    for (int i = 3; i >= 1; i--) {   //attempts loop
                        System.out.println();
                        System.out.print("Username/Phone: ");
                        String cred1 = sc.next();
                        System.out.print("Pin: ");
                        int cred2 = sc.nextInt();
                        System.out.println();

                        if ((cred1.equals(name) || cred1.equals(contact)) && cred2 == pin) {  //to validate the credentials
                            homePage:
                            for (;;) {
                                System.out.println();
                                System.out.println("****Home Page****");
                                System.out.println();
                                System.out.println("1. Deposit Amount");
                                System.out.println("2. Withdraw Amount");
                                System.out.println("3. Check Balance");
                                System.out.println("4. Statement");
                                System.out.println("5. Loan");
                                System.out.println("6. Profile");
                                System.out.println("7. Logout");
                                System.out.println();
                                System.out.print("Select an option: ");
                                int opt = sc.nextInt();
                                System.out.println();

                                switch (opt) {
                                    case 1: {
                                        System.out.println("Deposit Module");
                                        System.out.println();
                                        System.out.print("Enter the amount: ");
                                        double depAmt = sc.nextDouble();
                                        bal += depAmt;
                                        System.out.println("Amount Deposited Successfully");
                                        statement.add("Deposit: "+depAmt+"Rs");    //add transaction in ArrayList
                                        break;
                                    }

                                    case 2: {
                                        System.out.println("Withdraw Module");
                                        System.out.println();
                                        System.out.print("Enter the amount: ");
                                        int withAmt = sc.nextInt();
                                        System.out.print("Enter your Pin: ");
                                        int pin1 = sc.nextInt();
                                        if (pin1 == pin) {
                                            if (withAmt <= bal) { //here the withdraw amot should be less than total bal
                                                bal -= withAmt;
                                                System.out.println("Amount Debited Successfully");
                                                statement.add("Debited: "+withAmt+"Rs");       //add transaction in ArrayList
                                            } else {
                                                System.out.println("Insufficient Funds");
                                            }
                                        } else {
                                            System.out.println("Invalid Pin");
                                        }
                                        break;
                                    }

                                    case 3: {
                                        System.out.println("Check Balance Module");
                                        for (int j = 3; j >= 1; j--) {
                                            System.out.println();
                                            System.out.print("Enter the pin: ");
                                            int pin1 = sc.nextInt();
                                            if (pin == pin1) {
                                                System.out.println("Your Account Balance is: " + bal + " Rs");
                                                continue homePage; //again goes to the home page
                                            } else {
                                                System.out.println("Invalid Pin");
                                                System.out.println("Attempts left: " + (j - 1));
                                            }
                                        }
                                        System.out.println("It's not your Account");
                                        System.out.println("Account blocked for 24 Hours");
                                        System.exit(0); //directly terminates the code
                                        break;
                                    }

                                    case 4: {
                                        System.out.println("Statement module");
                                        System.out.println();
                                        // prints all the stored statements
                                        for(String s : statement){
                                            System.out.println(s);
                                        }
                                       
                                        break;
                                    }

                                    case 5: {
                                        System.out.println("Loan Module");
                                        break;
                                    }

                                    case 6: {
                                        System.out.println("Profile Module");
                                        System.out.println("Name: "+name);
                                        System.out.println("Email: "+email);
                                        System.out.println("Address: "+address);
                                        System.out.println("Phone Details: "+contact);
                                        System.out.println("IFSC Code: "+ifscCode);
                                        System.out.println("Current Balance: "+bal);
                                        System.out.println("Account Number: "+accountNumber);
                                        
                                        break;
                                    }

                                    case 7: {
                                        System.out.println("Thank you Visit Again");
                                        System.exit(0);
                                    }

                                    default: {
                                        System.out.println("Invalid option");   //invalid option from homepage
                                        break;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Invalid Credentials");
                            System.out.println("Attempt left: " + (i - 1));
                        }
                    }

                    System.out.println("Thank you, never visit again");
                    System.out.println("Account Deactivated for 48 Hours");
                    System.exit(0);
                }

                default: {
                    System.out.println("Invalid Option");
                    break;
                }
            }
        }
    }
}
