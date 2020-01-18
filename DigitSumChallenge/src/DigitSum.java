public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(125)); // 8
        System.out.println(sumDigits(-125)); // -1
        System.out.println(sumDigits(4)); // -1
        System.out.println(sumDigits(32123)); // 11
        System.out.println(sumDigits(1)); // -1
    }


    public static int sumDigits(int number) {
        if (number < 10) return -1;
        
        int sum = 0;
        String string = String.valueOf(number);
        String[] array = string.split("");

        for (String s : array) {
            sum += Integer.parseInt(s);
        }

        return sum;
    }
}
