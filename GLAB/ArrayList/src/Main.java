public class Main {
    public static void main(String[] args) {
        HandsOnArrayList h0 = new HandsOnArrayList();

        h0.addStudent("Jane");
        h0.addStudent("John");
        h0.addStudent("Mary");
        h0.addStudent("Bob");
        h0.addStudent("Jack");

        System.out.println("Original ArrayList: ");
        h0.printStudentList();

        System.out.println("Remove one student: ");
        h0.removeStudent("Jane");
        h0.printStudentList();

        System.out.println("Sort ArrayList alphabetically : ");
        h0.sortStudents();
        h0.printStudentList();
    }
}
