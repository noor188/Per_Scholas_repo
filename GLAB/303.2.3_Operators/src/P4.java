public class P4 {
    public static void main(String[] args) {
        int x = 7, y = 17, z;
        // x | y = 10111 , 23
        z = x | y;
        System.out.println("Decimal format : " + z + " ,Binary format : " + Integer.toBinaryString(z));
    }
}
