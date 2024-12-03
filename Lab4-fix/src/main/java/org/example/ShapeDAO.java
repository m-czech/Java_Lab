package org.example;

import org.hibernate.SessionFactory;

public class ShapeDAO {
    private final SessionFactory sessionFactory;
    public ShapeDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Shape shape) {
        this.sessionFactory.inTransaction(session -> {
            session.persist(shape);
        });
        this.sessionFactory.openSession().persist(shape);
    }

    public Shape get(int id) {
        return this.sessionFactory.openSession().get(Shape.class, id);
    }
}
