package ui;

import Generics.GenericClass;
import Generics.GenericMethodDemo;
import interfaces.GenericInterface;
import interfaces.impl.GenericInterfaceimpl;
import models.Employee;
import models.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create Employee and SalariedEmployee objects
        Employee emp = new Employee(1, "John Doe");
        SalariedEmployee semp = new SalariedEmployee(2, "Jane Smith", 85000.0);
        System.out.println(emp.toString());
        System.out.println(semp.toString());

        // Step 2: Use GenericClass with Employee and SalariedEmployee
        GenericClass<Employee> G0 = new GenericClass<>(emp);
        GenericClass<SalariedEmployee> e1 = new GenericClass<>(semp);
        G0.displayEmployeeDetails();

        // Step 3: Use GenericInterface with GenericInterfaceImpl class
        GenericInterface<Employee> e0 = new GenericInterfaceimpl<>();
        // Step 4: Use GenericMethod
        Integer[] empList = {1,2};
        GenericMethodDemo.printList(empList);
    }
}
