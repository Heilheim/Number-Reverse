public class NumberReverse {
    public static void main(String[] args) {
        int number = 123456789;

        int result = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;
        }

        System.out.println("Reverse number: " + result);
    }
}
