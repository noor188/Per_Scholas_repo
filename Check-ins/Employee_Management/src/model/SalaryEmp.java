package model;

public class SalaryEmp extends Employee {


    public SalaryEmp() {}
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
        System.out.println("Bi-Monthly Salary: $" + calculateSalary());
    }

    @Override
    public Employee inputEmployee(){
        System.out.print("Enter annual salary: ");
        this.payRate = sc.nextDouble();
        return null;
    }


}
