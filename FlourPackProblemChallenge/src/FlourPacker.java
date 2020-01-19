public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(9, 2, 0)); // false
        System.out.println(canPack(9, 1, 5)); // true
        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 12)); // false
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        bigCount *= 5;

        return goal / smallCount == 0;
    }
}
