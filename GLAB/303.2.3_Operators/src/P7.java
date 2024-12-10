public class P7 {
    public static void main(String[] args) {
        int x, y;
        x = 5;
        y = 8;
        int sum = ++x + y;
        System.out.println("++x + y = " + sum);
        x = 5;
        y = 8;
        sum = (x++) + y;
        System.out.println("x++ + y = " + sum);

    }
}
