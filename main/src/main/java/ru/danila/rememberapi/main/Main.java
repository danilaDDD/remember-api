package ru.danila.rememberapi.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory()){
            try(Session session = sessionFactory.openSession()){
                System.out.println(session);
            }
        }
    }
}