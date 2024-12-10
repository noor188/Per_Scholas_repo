package Generics;

public class GenericMethodDemo {

    public static <T> void printList(T[] elements){
        System.out.println("Printing list of employees:");
        for (T element : elements){
            System.out.println(element.toString());
        }
    }
}
