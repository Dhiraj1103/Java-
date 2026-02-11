//First Missing digit
class FmissingNumber {
    public static void main(String[] args) {
        int num = 1345;
        int temp = num;
        int min = 9;

        // Find the minimum digit in the number
        while (num != 0) {
            int dig=num%10;
            if (dig < min)
                min = dig;
            num /= 10;
        }

        // From the minimum digit to 9, find the first missing digit
        for (int i = min; i <= 9; i++) {
            num = temp;
            int count = 0;
            while (num != 0) {
                int  dig=num%10;
                if (dig == i) {
                    count++;
                }
                num /= 10;
            }
            if (count == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
