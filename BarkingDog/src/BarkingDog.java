public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1)); // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8)); // false
        System.out.println(shouldWakeUp(true, -1)); // false
        System.out.println(shouldWakeUp(true, 4)); // true
        System.out.println(shouldWakeUp(true, 23)); // true
        System.out.println(shouldWakeUp(true, 44)); // false
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        return isBarking && (hourOfDay >= 0 && hourOfDay <= 23) && (hourOfDay < 8 || hourOfDay > 22);
    }
}
