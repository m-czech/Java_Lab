package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        ShapeDAO shapeDao = new ShapeDAO(sessionFactory);
        Shape shape = new Shape();
        shape.id = 2;
        shape.name = "Test";
        shapeDao.save(shape);

        var retrievedShape = shapeDao.get(2);
        System.out.println(retrievedShape);
    }
}