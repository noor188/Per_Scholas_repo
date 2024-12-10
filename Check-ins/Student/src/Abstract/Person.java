package Abstract;

public abstract class Person {

    protected String firstname;
    protected String lastname;
    protected int age;

    public Person(){}

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    protected String fullName(){
        return firstname + " " + lastname;
    }

    // abstruct  method
    public abstract void displayPersonDetails();
}
