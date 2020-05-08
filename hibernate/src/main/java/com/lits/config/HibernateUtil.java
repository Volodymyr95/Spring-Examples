package com.lits.config;

import com.lits.entity.Course;
import com.lits.entity.Teacher;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import java.util.HashMap;

public class HibernateUtil {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                var registryBuilder = new StandardServiceRegistryBuilder();

                var settings = new HashMap<String, String>();
                settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate_tutorial?createDatabaseIfNotExist=true");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "root");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
                settings.put(Environment.HBM2DDL_AUTO, "create");
                settings.put(Environment.AUTOCOMMIT, "true");

                registryBuilder.applySettings(settings);

                registry = registryBuilder.build();

                var sources = new MetadataSources(registry);
                sources.addAnnotatedClass(Teacher.class);
                sources.addAnnotatedClass(Course.class);
                var metadata = sources.getMetadataBuilder().build();

                sessionFactory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                if (registry != null) {
                    StandardServiceRegistryBuilder.destroy(registry);
                }
            }
        }
        return sessionFactory;
    }


}
