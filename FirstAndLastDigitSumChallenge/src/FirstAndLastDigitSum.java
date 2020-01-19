public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // 4
        System.out.println(sumFirstAndLastDigit(257)); // 9
        System.out.println(sumFirstAndLastDigit(0)); // 0
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastDigit = number % 10;
        int temp = number;
        int reversed = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            reversed *= 10;
            reversed += remainder;
            temp /= 10;
        }

        int firstDigit = reversed % 10;

        return firstDigit + lastDigit;
    }
}
