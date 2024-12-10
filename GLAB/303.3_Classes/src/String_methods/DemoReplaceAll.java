package String_methods;

public class DemoReplaceAll {
    public static void main(String[] args) {
        String str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));


    }
}
