import garden.vegetable.*;
import nursery.vegetable.*;

public class TestImport {
    public static void main(String[] args) {
        String s = "we are testing import statements";
        System.out.println(s);

        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args);
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local vegetable");
    }
}