package org.lb_1.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.lb.money.UserDetails;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
    public static void main(String[] args) {
        UserDetails user = new UserDetails();
        user.setUserId(1); // make data for the database table
        user.setUserName("First User"); // the same as above
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

    }
}
