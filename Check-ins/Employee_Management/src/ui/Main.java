package ui;

import model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee =  new Employee("Noor", "mamlook", "developer", 200.5);
        Employee employee1 = new Employee("m", "f", "instructor", 200.5);
        Employee employee2 = new Employee("p", "w", "software engineer", 200.5);
        Employee employee3 = new Employee("s", "a", "teacher", 200.5);

        Employee [] employees = new Employee[] {employee, employee1, employee2, employee3};

        for (Employee e : employees){
            System.out.println("Salary:   " + e.calculateWeeklySalary());
        }

        for (Employee e : employees){
            //System.out.println(e.toString());
        }

        //System.out.println(employee1.equals(employee2));

    }
}
