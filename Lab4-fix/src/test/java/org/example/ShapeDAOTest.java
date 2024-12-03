package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.junit.Assert;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;
public class ShapeDAOTest {
    private ShapeDAO shapeDao;
    private SessionFactory sessionFactory;
    @org.junit.Before
    public void setUp() throws Exception {
        String url = "jdbc:sqlite:shapeDaoTest.db";

        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                var meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        Map<String, Object> settings = new HashMap<>();
        settings.put(Environment.DRIVER, "org.sqlite.JDBC");
        settings.put(Environment.URL, "jdbc:sqlite::memory:"); // In-memory SQLite database
        settings.put(Environment.DIALECT, "org.hibernate.community.dialect.SQLiteDialect");
        settings.put(Environment.HBM2DDL_AUTO, "create-drop"); // Automatically create and drop tables
        settings.put(Environment.SHOW_SQL, true);
        settings.put(Environment.FORMAT_SQL, true);

        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(settings)
                .build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);

        metadataSources.addAnnotatedClass(Shape.class);

        this.sessionFactory = metadataSources.getMetadataBuilder()
                .build()
                .getSessionFactoryBuilder()
                .build();

        this.shapeDao = new ShapeDAO(sessionFactory);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void save() {
        Shape shape = new Shape();
        shape.id = 1;

        this.shapeDao.save(shape);

        Assert.assertNotNull(this.sessionFactory.openSession().get(Shape.class, 1));
    }

    @org.junit.Test
    public void get() {
        Shape shape = new Shape();
        shape.id = 1;
        shape.name = "test";

        var session = this.sessionFactory.openSession();
        var transaction = session.beginTransaction();
        session.persist(shape);
        transaction.commit();
        session.close();

        Assert.assertNotNull(this.shapeDao.get(1));
    }
}