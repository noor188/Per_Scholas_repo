package Generics;

import models.Employee;

public class GenericClass <T extends Employee> {

    private T employee;

    public GenericClass(T employee) {
        this.employee = employee;
    }

    public void setEmployee(T employee) {
        this.employee = employee;
    }

    public T getEmployee() {
        return employee;
    }

    public void displayEmployeeDetails(){
        System.out.println("Value:" + employee.toString());
    }
}
