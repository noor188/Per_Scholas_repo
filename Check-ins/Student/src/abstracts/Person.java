package abstracts;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public int getAge(){
        return this.age;
    }

    public abstract void display();

}
