package controller;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserController {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

      //  addUser(factory, session);
        //  findUser(factory,  session, 1);
      //  updateUser(session, 2);
        deleteUser(session, 2);
    }

    public static void addUser(SessionFactory factory, Session session){
            Transaction transaction = session.beginTransaction();
            User uOne = new User();
            uOne.setEmail("haseeb@gmail.com");
            uOne.setFullname("Moh Haseeb");
            uOne.setPassword("has123");
            uOne.setSalary(2000.69);
            uOne.setAge(20);
            uOne.setCity("NYC");

            User uTwo = new User();
            uTwo.setEmail("James@gmail.com");
            uTwo.setFullname("James Santana");
            uTwo.setPassword("James123");
            uTwo.setSalary(2060.69);
            uTwo.setAge(25);
            uTwo.setCity("Dallas");

            User uThree = new User();
            uThree.setEmail("Shahparan@gmail.com");
            uThree.setFullname("AH Shahparan");
            uThree.setPassword("Shahparan123");
            uThree.setSalary(3060.69);
            uThree.setAge(30);
            uThree.setCity("Chicago");

            User uFour = new User("Christ", "christ@gmail.com", "147852", 35, 35000.3, "NJ");
            User uFive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");

            session.persist(uOne);
            session.persist(uTwo);
            session.persist(uThree);
            session.persist(uFour);
            session.persist(uFive);

            transaction.commit();
            System.out.println("Successfully saved!!!");
            factory.close();
            session.close();

    }

    public static void findUser(SessionFactory factory, Session session, int id){

        Transaction transaction = session.beginTransaction();

        User u = session.get(User.class, id);
        System.out.println("FullName: " + u.getFullname());
        System.out.println("Email: " + u.getEmail());
        System.out.println("password: " + u.getPassword());

        transaction.commit();
        factory.close();
        session.close();

    }

    public static void updateUser(Session session, int id){

            Transaction transaction = session.beginTransaction();

            User u = new User();
            u.setId(id);
            u.setEmail("mhaseeb@perscholas");
            u.setFullname("M Haseeb");
            u.setPassword("123456");
            session.merge(u);
            session.getTransaction().commit();
            session.close();
    }

    public static void deleteUser(Session session, int id){

        Transaction transaction = session.beginTransaction();

        User u = session.get(User.class, id);
        session.delete(u);
        session.getTransaction().commit();
        session.close();
    }
}
