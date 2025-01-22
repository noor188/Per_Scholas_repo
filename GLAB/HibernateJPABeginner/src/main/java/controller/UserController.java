package controller;

import jakarta.persistence.TypedQuery;
import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserController {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

      //  addUser(factory, session);
        //  findUser(factory,  session, 1);
      //  updateUser(session, 2);
      //  deleteUser(session, 2);
      //  findUserHql(factory, session);
        //getRecordbyId(factory, session);
        //getRecords(factory, session);
       // getMaxSalary(factory, session);
       // getMaxSalaryGroupBy(factory, session);
        namedQueryExample(factory, session);
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

    public static void findUserHql(SessionFactory factory,Session session){

        Transaction tx = session.beginTransaction();
        //String hql = "FROM User";
        String selectHQL = "SELECT u from User u";
        TypedQuery<User> query = session.createQuery(selectHQL, User.class);
        List<User> users =  query.getResultList();

        System.out.printf("%s%13s%17s%34s%n", "|User Id","|Full name","|Email","|Password");
        for (User u : users){
            System.out.printf(" %-10d %-20s %-30s %s %n", u.getId(), u.getFullname(), u.getEmail(), u.getPassword());
        }

        tx.commit();
    }

    public static void getRecordbyId(SessionFactory factory,Session session){
        Transaction tx = session.beginTransaction();

        String hql = "FROM User u WHERE u.id > 1 ORDER BY u.salary DESC";
        TypedQuery<User> query = session.createQuery(hql, User.class);
        List<User> users = query.getResultList();

        System.out.printf("%s%13s%17s%34s%21s%n", "|User Id", "|Full name", "|Email", "|Password", "|Salary");
        for(User u : users){
            System.out.printf("%-10d %-20s %-30s %-23s %s %n", u.getId(), u.getFullname(), u.getEmail(), u.getPassword(), u.getSalary());
        }

        tx.commit();
    }

    public static void getRecords(SessionFactory factory, Session session){

        Transaction tx = session.beginTransaction();
        String hql = "SELECT u.salary, u.fullname FROM User u";
        TypedQuery<Object[]> query = session.createQuery(hql,Object[].class);
        List<Object[]> users = query.getResultList();

        System.out.printf("%s%13s%n", "|Full name", "|Salary");
        for(Object[] user : users){
            System.out.printf("%-20s %s %n", user[0], user[1]);
        }
        tx.commit();
    }

    public static void getMaxSalary(SessionFactory factory, Session session){

        Transaction tx = session.beginTransaction();

        String hql = "SELECT MAX(u.salary) FROM User u";
        TypedQuery<Object> query = session.createQuery(hql, Object.class);
        Object result = query.getSingleResult();
        System.out.printf("%s%s", "Max result: " , result);
        tx.commit();
    }

    public static void getMaxSalaryGroupBy(SessionFactory factory, Session session){
        Transaction tx = session.beginTransaction();

        String hql = "SELECT SUM(u.salary), u.city FROM User u GROUP BY u.city";
        TypedQuery<Object[]> query = session.createQuery(hql, Object[].class);
        List<Object[]> users = query.getResultList();
        System.out.printf("%s%13s%n", "|Sum Salary", "|City");

        for(Object[] user : users){
            System.out.printf("%s%12s%n", user[0], user[1]);
        }

        tx.commit();
    }

    public static void namedQueryExample(SessionFactory factory, Session session){
        Transaction tx = session.beginTransaction();

        String hql = "FROM User u WHERE u.id = :id";
        TypedQuery<User> query = session.createQuery(hql, User.class);
        query.setParameter("id", 1);
        List<User> users = query.getResultList();

        System.out.printf("%s%13s%n", "| User Id ", "|Email");
        for (User user: users){
            System.out.printf("%-20d %-10s %n", user.getId(), user.getEmail());
        }

        tx.commit();
    }
}
