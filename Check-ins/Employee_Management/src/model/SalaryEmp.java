package model;

public class SalaryEmp extends Employee {


    public SalaryEmp(String firstName, String lastName, String title, double payRate){
        super(firstName, lastName, title, payRate);
    }

    @Override
    public double calculateSalary(){
        return payRate / 24.0;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Bi-Monthly Salary: " + calculateSalary());
    }


}
