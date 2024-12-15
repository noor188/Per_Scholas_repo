package ui;
import model.Student;

import java.util.Comparator;
import java.util.HashSet;
import  java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student s0 = new Student("Alice", "Johnson", 20, "Computer Science");
        Student s1 = new Student("Bob", "Smith", 22, "Mathematics");

        s0.display();
        s1.display();

    }
}
