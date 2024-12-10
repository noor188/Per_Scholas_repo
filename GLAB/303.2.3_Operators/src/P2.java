public class P2 {
    public static void main(String[] args) {
        shiftRight(150); // 37 , 00100101
        shiftRight(225);
        shiftRight(1555);
        shiftRight(324556);

    }

    public static void shiftRight(int x){
        System.out.println("decimal format : " + x + " ,Binary format " + Integer.toBinaryString(x));
        System.out.println("Right shift by 2");
        x = x >> 2;
        System.out.println("decimal format : " + x + " ,binary format : " + Integer.toBinaryString(x) + "\n");

    }
}
