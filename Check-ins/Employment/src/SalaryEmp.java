public class SalaryEmp extends Employee{

    public SalaryEmp(String firstName, String lastName, String title, float payRate){
        super(firstName, lastName, title, payRate);
    }

    @Override
    public double calculateSalary() {
        return 2 * getPayRate();
    }

    public void display(){
        System.out.println("Employee name: " + getFirstName() + "\ntitle: " + getTitle() + "\npayRate: " + getPayRate());
    }
}
