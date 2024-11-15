public class ArithmeticOperatorsDemo {

    public static  void main(String[] args){
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);

        int tooBig   = Integer.MAX_VALUE + 1;
        int tooSmall = Integer.MIN_VALUE - 1;

        System.out.println("tooBig becomes "   + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);

        System.out.println(4.0 / 0.0);
        System.out.println(-4.0 / 0.0);
        System.out.println(0.0 / 0.0);
        double d1 = 12 / 8;
        double d2 = 12.0F / 8;
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);



    }
}
