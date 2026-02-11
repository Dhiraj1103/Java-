package OOPs;

import java.util.Scanner;

class Product {
    private final double defaultDiscount = 5.0;

    public void applyDiscount(double price, double discount) {
        System.out.println("You get a discount of: " + discount + "%");
        double finalPrice = price - (price * discount / 100);
        System.out.println("Final price after using discount coupon: " + finalPrice);
    }

    public void normalDiscount(double price) {
        System.out.println("You get a normal discount of: " + defaultDiscount + "%");
        double finalPrice = price - (price * defaultDiscount / 100);
        System.out.println("Final price without using discount coupon: " + finalPrice);
    }
}

 class Shop {
    private static final Scanner sc = new Scanner(System.in);
    private static final Product product = new Product();
    private static final double COUPON_DISCOUNT = 15.0;

    private static void processProduct(String name, double price) {
        System.out.println("Selected: " + name);
        System.out.print("Do you have a discount coupon? (1 for Yes, 0 for No): ");
        int hasCoupon = sc.nextInt();

        if (hasCoupon == 1) {
            System.out.print("Enter the coupon code: ");
            String code = sc.next();
            if (code.equals("MH12")) {
                product.applyDiscount(price, COUPON_DISCOUNT);
            } else {
                System.out.println("Invalid coupon. Applying normal discount.");
                product.normalDiscount(price);
            }
        } else if (hasCoupon == 0) {
            product.normalDiscount(price);
        } else {
            System.out.println("Invalid option entered. Try again!");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n------ Welcome to Maharashtra Electronics ------");
            System.out.println("Choose a product:");
            System.out.println("1. Boat Headphones - ₹2000");
            System.out.println("2. iPhone 16        - ₹70000");
            System.out.println("3. Samsung S25      - ₹60000");
            System.out.println("4. Dyson HairDryer  - ₹40000");
            System.out.println("5. JBL SoundBar     - ₹30000");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0 -> {
                    System.out.println("Thank you! Visit Us Again.");
                    System.exit(0);
                }
                case 1 -> processProduct("Boat Headphones", 2000);
                case 2 -> processProduct("iPhone 16", 70000);
                case 3 -> processProduct("Samsung S25", 60000);
                case 4 -> processProduct("Dyson HairDryer", 40000);
                case 5 -> processProduct("JBL SoundBar", 30000);
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
