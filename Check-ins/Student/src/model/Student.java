package model;
import Abstract.Person;
import Interface.Studyable;

import java.util.Scanner;

public class Student extends Person implements Studyable {

    private String major;

    public Student() {}
    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.major = "";
    }

    @Override
    public void displayPersonDetails() {
        System.out.println("Name: "+ fullName());
        System.out.println("Age: "+ age);
        System.out.println("Major: "+ major);
        System.out.println(firstname+ " " + lastname + " is studing " + major);
    }

    @Override
    public void inputClassDescription() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide your major: ");
        this.major = sc.nextLine();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
