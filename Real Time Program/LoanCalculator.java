import java.util.Scanner;

class LoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {
            System.out.println("********** LOAN CALCULATOR **********");
            System.out.println();
            System.out.println("1. Home Loan");
            System.out.println("2. Gold Loan");
            System.out.println("3. Vehicle Loan");
            System.out.println("4. Education Loan");
            System.out.println("5. Personal Loan");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter your option: ");
            int opt = sc.nextInt();

            System.out.println();
            double roi = 0;
            String loanType = null;
            boolean isValid = true;

            switch (opt) {
                case 1:
                    loanType = "Home Loan";
                    roi = 8.45;
                    break;
                case 2:
                    loanType = "Gold Loan";
                    roi = 3;
                    break;
                case 3:
                    loanType = "Vehicle Loan";
                    roi = 12;
                    break;
                case 4:
                    loanType = "Education Loan";
                    roi = 9.5;
                    break;
                case 5:
                    loanType = "Personal Loan";
                    roi = 16;
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Option");
                    isValid = false;
                    break;
            }

            if (!isValid) {   //false
                continue;
            }

            System.out.print("Enter the amount: ");
            double amount = sc.nextDouble();
            if (amount < 1000 || amount > 500000) {
                System.out.println("Invalid Amount Entered");
                continue;
            }

            System.out.print("Enter the tenure in years: ");
            double tenure = sc.nextDouble();
            if (tenure <= 1 || tenure > 20) {
                System.out.println("Invalid Tenure");
                continue;
            }

            System.out.println();
            System.out.println("Loan Type: " + loanType);
            System.out.println("Principal Amount: " + amount + " Rs");
            System.out.println("Rate of Interest: " + roi + " %");
            System.out.println("Tenure: " + tenure + " yrs");

            double interest = amount * roi / 100;
            System.out.println("Interest: " + (interest * tenure) + " Rs");
            System.out.println("Total Loan Amount: " + (amount + (interest * tenure)) + " Rs");
            System.out.println("EMI: " + ((amount + (interest * tenure)) / (tenure * 12)) + " Rs/month");
        }
    }
}
