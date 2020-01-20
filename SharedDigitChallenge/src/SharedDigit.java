import java.util.ArrayList;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }


    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        ArrayList<Integer> integers = new ArrayList<>();

        while (num1 != 0) {
            int remainder = num1 % 10;
            num1 /= 10;

            integers.add(remainder);
        }

        while (num2 != 0) {
            int remainder = num2 % 10;
            num2 /= 10;

            if (integers.contains(remainder)) {
                return true;
            }
        }

        return false;
    }
}
