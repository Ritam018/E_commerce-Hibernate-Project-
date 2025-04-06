package com.code.hb;

import org.hibernate.SessionFactory;

public class App {
    public static void main(String[] args) {
        // Obtain the SessionFactory from HibernateUtil
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try {
            // Uncomment the necessary lines when required
             //new CreateCategory(sessionFactory);
             //new CreateProduct(sessionFactory);
            //new CreateUsers(sessionFactory);
             //new CreateOrders(sessionFactory);
        	//new CreateOrderDetails(sessionFactory);
             new Fetch(sessionFactory);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }
}