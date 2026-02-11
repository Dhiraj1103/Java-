//Second Missing digit
class SmissingNumber {
    public static void main(String[] args) {
        int num = 135;
        int original = num;  // Save the original number
        int min = 10;
        int printCount = 0;

        // Find minimum digit
        while (num != 0) {
            int dig = num % 10;
            if (dig < min) {
                min = dig;
            }
            num /= 10;
        }

        // Find the 2nd missing digit
        for (int i = min; i <= 9; i++) {
            int count = 0;
            int temp = original; // Use original number here
            while (temp != 0) {
                int dig = temp % 10;
                if (dig == i) {
                    count++;
                }
                temp /= 10;
            }
            if (count == 0) {
                printCount++;
            }
            if (printCount == 2) {
                System.out.println(i);
                break;
            }
        }
    }
}
