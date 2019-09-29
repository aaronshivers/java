public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false

        System.out.println(isTeen(9)); // false
        System.out.println(isTeen(13)); // true
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return num1 >= 13 && num1 <= 19 || num2 >= 13 && num2 <= 19 || num3 >= 13 && num3 <= 19;
    }

    public static boolean isTeen(int num1) {
        return num1 >= 13 && num1 <= 19;
    }
}
