package models;

public class SalariedEmployee extends Employee{

    private double salary;

    public SalariedEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return "SalariedEmployee={" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                "salary=" + this.salary +
                '}';
    }
}
