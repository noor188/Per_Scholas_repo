import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class HandsOnArrayList {
    ArrayList<String> students = new ArrayList<>();

    public void addStudent(String name){
        students.add(name);
    }

    public void printStudentList(){
        System.out.println(students);
    }

    public void removeStudent(String student){
        students.remove(student);
    }

    public void sortStudents(){
        Collections.sort(students);
    }
}
