package com.vikrant.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateConfig {

    public static SessionFactory getConnection()
    {
        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory sf= cfg.buildSessionFactory();

        return sf;
    }
}
