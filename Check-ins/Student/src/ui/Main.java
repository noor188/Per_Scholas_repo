package ui;
import model.Student;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Alice" , "Johnson", 20);
        student1.inputClassDescription();
        student1.displayPersonDetails();

        System.out.println();

        Student student2 = new Student("Bob" , "Smith", 22);
        student2.inputClassDescription();
        student2.displayPersonDetails();





    }
}
