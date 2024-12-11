package ui;

import model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e0 = new Employee();
        Employee e1 = e0.inputEmployee();
        e1.display();

    }
}
