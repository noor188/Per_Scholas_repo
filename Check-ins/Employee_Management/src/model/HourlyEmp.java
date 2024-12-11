package model;

public class HourlyEmp extends Employee{

    private double hoursWorked;

    public HourlyEmp() {}

    public HourlyEmp(String firstName, String lastName, String title, double payRate){
        super(firstName, lastName, title, payRate);
        this.hoursWorked = 0;
    }

    @Override
    public double calculateSalary(){
        return super.payRate * this.hoursWorked;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Hours Worked:  " + this.hoursWorked);
        System.out.println("Weekly Pay:  $" + this.calculateSalary());
    }

    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked(){
        return this.hoursWorked;
    }

    @Override
    public Employee inputEmployee(){
        System.out.print("Enter hourly rate: ");
        this.payRate = sc.nextDouble();
        System.out.print("Enter hours worked: ");
        this.hoursWorked = sc.nextInt();
        return null;
    }
}
