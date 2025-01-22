package Runner;

import model.Address;
import model.Department;
import model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //manyToOne();
        //oneToMany();
        oneToOne();
    }

    public static void manyToOne(){
        Configuration config = new Configuration();
        config.configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");

//        Teacher t1 = new Teacher("1000", "MHaseeb", dept1);
//        Teacher t2 = new Teacher("2220","Shahparan",dept1);
//        Teacher t3 = new Teacher("3000","James",dept1);
//        Teacher t4 = new Teacher("40000","Joseph",dept2);

//        session.persist(dept1);
//        session.persist(dept2);
//        session.persist(t1);
//        session.persist(t2);
//        session.persist(t3);
//        session.persist(t4);

        tx.commit();
        factory.close();
        session.close();
    }

    public static void oneToMany(){
        Configuration config = new Configuration();
        config.configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Teacher t1 = new Teacher("1000","MHaseeb");
        Teacher t2 = new Teacher("2220","Shahparan");
        Teacher t3 = new Teacher("3000","James");
        Teacher t4 = new Teacher("40000","Joseph");
        Teacher t5 = new Teacher("200","Ali");


        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        List<Teacher> teacherList1 = new ArrayList<>();
        teacherList1.add(t4);
        teacherList1.add(t5);

        session.persist(t1);
        session.persist(t2);
        session.persist(t3);
        session.persist(t4);
        session.persist(t5);

        Department d1 = new Department("Development");
       // d1.setTeacherList(teacherList1);

        session.persist(d1);
        tx.commit();
        factory.close();
        session.close();

    }

    public static void oneToOne(){
        Configuration config = new Configuration();
        config.configure();

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Address d1 = new Address();
        d1.setCity("Dallas");
        d1.setState("Tx");
        d1.setZipCode(00000);

        Address d2 = new Address();
        d2.setCity("columbia");
        d2.setState("NY");
        d2.setZipCode(111111);

        Department e1 = new Department("Engineering");
        Department e2 = new Department("Art");

        Teacher t1 = new Teacher();
        t1.setSalary("10000");
        t1.setTeacherName("Latanya");
        t1.setDepartment(e1);
        t1.setAddress(d1);

        Teacher t2 = new Teacher();
        t2.setSalary("10500");
        t2.setTeacherName("Elon");
        t2.setDepartment(e2);
        t2.setAddress(d2);


        session.persist(d1);
        session.persist(d2);
        session.persist(e1);
        session.persist(t1);
        session.persist(t2);

        tx.commit();
        factory.close();
        session.close();
    }
}
