class MissingDigit {

    public static void main(String[] args) {

        int num = 145; // Example input
        int max = 0, min = 9;
        int temp = num;

        // Step 1: Find max and min digits
        while (temp != 0) {
            int dig = temp % 10;
            if (dig > max) {
                max = dig;
            }
            if (dig < min) {
                min = dig;
            }
            temp /= 10;

        }
         System.out.println(max);
            System.out.println(min);

        // Step 2: Print digits from 1 to max that are not in the number
        for (int i = 1; i <= max; i++) {
            int count = 0;
            int demo = num;
            while (demo != 0) {
                if (demo % 10 == i)
                    count++;
                demo /= 10;
            }
            if (count == 0)
                System.out.println(i + " is missing");
        }
    }
}
