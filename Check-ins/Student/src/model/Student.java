package model;
import interfaces.studyable;
import abstracts.Person;
import java.util.Scanner;

public class Student extends Person implements studyable {

    private String major;
    Scanner input = new Scanner(System.in);

    public Student(String firstName, String lastName, int age, String major){
        super(firstName, lastName, age);
        this.major = major;
    }

    @Override
    public void display(){
        System.out.println("Name: " + super.getFullName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Major:" + this.major);
        this.displayMajor();
       }

    @Override
    public void displayMajor(){
        System.out.println(super.getFullName() + " is studying " + this.major);
    }

}
