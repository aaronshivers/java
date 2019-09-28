public class Main {

    public static void main(String[] args) {

        long MPH = SpeedConverter.toMilesPerHour(10.25);
        System.out.println("Miles = " + MPH);

        SpeedConverter.printConversion(10.5);
    }
}
