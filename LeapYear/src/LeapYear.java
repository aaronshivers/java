public class LeapYear {

    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(1800));
        System.out.println(LeapYear.isLeapYear(1924));
        System.out.println(LeapYear.isLeapYear(10000));
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year >= 10000) return false;

        // 1
        if (year % 4 == 0) {
            // 2
            if (year % 100 == 0) {
                // 3
                return year % 400 == 0;
            }
            // 4
            return true;
        }
        // 5
        return false;
    }
}

//        return ((year % 100 == 0 && year % 400 == 0) || year % 4 == 0);
