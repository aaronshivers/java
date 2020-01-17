public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); // false
        System.out.println(areEqualByThreeDecimalPlaces(-4.0, 5.0)); // false
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 *= 1000;
        num2 *= 1000;

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        str1 = str1.length() > 3 ? str1.substring(0, 4) : str1;
        str2 = str2.length() > 3 ? str2.substring(0, 4) : str2;

        return str1.equals(str2);
    }
}
