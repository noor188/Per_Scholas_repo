public class main {
    public static void main(String args[]){
        // scenario 1
        String s1 = "Hello Java";
        System.out.println(s1 + " length is : " + s1.length()); // 10
        System.out.println("Is " + s1 +" empty : " + s1.isEmpty()); // false

        // scenario 2
        // task A
        String s2 = "Hello";
        String s3 = "hello";
        System.out.println("Are " + s2 + " and " + s3 + " the same string " + s2.equals(s3));
        System.out.println("Are " + s2 + " and " + s3 + " the same string (ignore case)" + s2.equalsIgnoreCase(s3));

        // task B
        String s4 = "Apple";
        String s5 = "Banana";
        System.out.println("compare " + s4 + " with " + s5 + " using compare to : " + s4.compareTo(s5));

        // task C
        String s6 = "Programming";
        System.out.println("Does " + s6 + " starts with \"Pro\" ? " + s6.startsWith("Pro"));
        System.out.println("Does " + s6 + " ends with \"ing\" ? " + s6.endsWith("ing"));

        // scenario 3

        // task A
        String s7 = "Character";
        System.out.println("The index of the first occurrence of \'a\' in " + s7 + " is " + s7.indexOf('a'));

        // task B
        System.out.println("The index of the last occurrence of \'a\' in " + s7 + " is " + s7.lastIndexOf('a'));

        // task C
        String s8 = "Learning Java";
        System.out.println("Does "+ s8 + " contains \"Java\" ?" + s8.contains("Java"));

        String s9 = "Developers";
        System.out.println("Does " + s9 + " contains the substring \"Dev\" ?" + s9.contains("Dev"));
        System.out.println("Does " + s9 + " starts with \"De\" ? " + s9.startsWith("De"));
    }
}
