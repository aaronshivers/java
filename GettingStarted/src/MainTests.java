public class MainTests {
    public static void main(String... args) throws Exception {
        main("");
        main();
    }

    public static void main(String args) {
        System.out.println("main(String args): Not an executable main method");
    }

    public static void main() {
        System.out.println("main(): Not an executable main method");
    }
}
