public class PrintArgs {
    public static void main(String[] args) {
        System.out.println("Printing some arguments in this code: ");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
