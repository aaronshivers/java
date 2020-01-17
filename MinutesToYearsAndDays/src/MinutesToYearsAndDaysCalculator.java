public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600); // 525600 min = 1 y and 0 d
        printYearsAndDays(1051200); // 1051200 min = 2 y and 0 d
        printYearsAndDays(561600); // 561600 min = 1 y and 25 d
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int hours = (int) minutes / 60;
            int days = hours / 24;
            int years = days / 365;
            int remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
