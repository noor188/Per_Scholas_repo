package model;
import java.util.Objects;
import java.util.Scanner;

public class Employee {

    protected String firstName;
    protected String lastName;
    protected String title;
    protected double payRate;
    Scanner sc = new Scanner(System.in);

    public Employee(){

    }

    public Employee(String firstName, String lastName, String title, double payRate){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.title     = title;
        this.payRate   = payRate;
    }

    public double calculateSalary(){
        return 0.0;
    }

    public void display(){
        System.out.println("Employee: " + firstName + " " + lastName);
        System.out.println("Title: " + title);
    }

    public void inputEmployee(){
        System.out.print("Enter first name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter last name:");
        this.lastName = sc.nextLine();
        System.out.print("Enter title: ");
        this.title = sc.nextLine();
    }

    @Override
    public String toString(){
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='"  + lastName + '\'' +
                ", title='" + title + '\'' +
                ", payRate'" + payRate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (super.equals(o)) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee emp = (Employee) o;
        return Double.compare(this.payRate, emp.payRate) == 0 && Objects.equals(firstName, emp.firstName)  && Objects.equals(lastName, emp.lastName)  && Objects.equals(title, emp.title);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Double.compare(payRate, employee.payRate) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}
