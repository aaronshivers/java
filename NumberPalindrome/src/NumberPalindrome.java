public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222)); // true
        System.out.println(isPalindrome(-123)); // false
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reversed = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reversed *= 10;
            reversed += remainder;
            palindrome /= 10;
        }

        return number == reversed;
    }
}
