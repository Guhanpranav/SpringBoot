package org.example;

import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


public class Main {
    public static void main(String[] args) {
       User u = new User("guhan", "email");

        SessionFactory sfc = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session s = sfc.openSession();
        s.beginTransaction();
        User u2 = s.get(User.class,1);
        u2.setName("kuhuuuu");

        s.persist(u2);
        String query = "select * from userDemo where name = :name";
        NativeQuery<User> u3 = s.createNativeQuery(query, User.class);
        u3.setParameter("name","kuhu");
        User real = u3.getSingleResult();
        System.out.println("The email is "+real.getEmail() +" and name is "+real.getName());
        s.getTransaction().commit();
        s.close();
        System.out.println("done ---");
    }
}