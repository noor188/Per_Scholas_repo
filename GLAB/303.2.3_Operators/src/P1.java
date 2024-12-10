public class P1 {
    public static void main(String[] args) {

        shiftLeft(2);
        shiftLeft(9);
        shiftLeft(17);
        shiftLeft(88);
    }
    public static void shiftLeft(int x){
        System.out.println("x in binary form : " + Integer.toBinaryString(x) + ", in decimal form : " + x);
        System.out.println("Perform shift left");
        x = x << 1;
        // binary 100 = decimal 4
        System.out.println("x in binary form : " + Integer.toBinaryString(x) + ", in decimal form : " + x + "\n");

    }
}
