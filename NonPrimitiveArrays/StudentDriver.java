package NonPrimitiveArrays;
import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        StudentDB db1 = new StudentDB("Root", "Root");
        db1.login("Root", "Root");

        // Sample data
        db1.addStudent("Dhiraj", 22, 2025, "BTech", 79, "B+", 'M', 48);
        db1.addStudent("Gaurav", 23, 2024, "BE", 75, "B+", 'M', 38);
        db1.addStudent("Harsh", 23, 2025, "BTech", 77, "AB+", 'M', 88);
        db1.addStudent("Riddhi", 22, 2025, "BTech", 80, "A+", 'F', 44);
        db1.addStudent("Priyanshu", 21, 2025, "BE", 60, "B+", 'M', 49);
        db1.addStudent("Anujay", 25, 2021, "BE", 50, "B+", 'M', 20);
        db1.addStudent("Shriraj", 27, 2018, "BE", 65, "AB+", 'M', 1);
        db1.addStudent("Swapnil", 21, 2026, "BTech", 30, "A+", 'M', 5);
        db1.addStudent("Suraj", 30, 2016, "BE", 33, "A+", 'M', 18);
        db1.addStudent("Vaishnavi", 25, 2020, "BTech", 20, "B+", 'F', 98);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Print Database");
            System.out.println("2. Sort By");
            System.out.println("3. Show Topper");
            System.out.println("4. Show 2nd Topper");
            System.out.println("5. Delete Failed Students (<35 marks)");
            System.out.println("6. Remove by Name");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (ch) {
                case 1:
                    db1.printDB();
                    break;

                case 2:
                    db1.sortBy("Age");
                    db1.printDB();
                    break;

                case 3:
                    System.out.println("Topper: " + db1.getTopper());
                    break;

                case 4:
                    System.out.println("Second Topper: " + db1.get2ndTopper());
                    break;

                case 5:
                    db1.deleteFailedStudent();
                    db1.printDB();
                    break;

                case 6:
                    System.out.print("Enter name to remove: ");
                    String name = sc.nextLine();
                    db1.removeByName(name);
                    db1.printDB();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
