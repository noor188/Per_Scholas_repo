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
        System.out.print("\nEmployee: " + firstName + " " + lastName);
        System.out.println(", Title: " + title);
    }

    public Employee inputEmployee(){
        System.out.print("Enter employee type (salaried/hourly): ");
        String empType = sc.nextLine();
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        Employee emp = null;

        switch(empType){
            case "salaried":
                emp = new SalaryEmp();
                emp.inputEmployee();
                break;
            case "hourly":
                emp = new HourlyEmp();
                emp.inputEmployee();
                break;
        }
        emp.firstName = firstName;
        emp.lastName = lastName;
        emp.title = title;
        return emp;
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

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}
