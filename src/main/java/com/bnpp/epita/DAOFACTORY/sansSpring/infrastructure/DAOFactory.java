package com.bnpp.epita.DAOFACTORY.sansSpring.infrastructure;

import com.bnpp.epita.DAOFACTORY.sansSpring.application.ClientServiceImpl;
import com.bnpp.epita.DAOFACTORY.sansSpring.application.IClientService;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAOFactory {

    static SessionFactory sessionFactory = null;
    public static SessionFactory getSessionFactory(){
        if (sessionFactory==null){
            sessionFactory = new Configuration()
                    .configure("hibernate-cfg.xml")
                    .buildSessionFactory();
        }
        return sessionFactory;
    }

    public static IClientDAO createClientDAO() {
        return new ClientDAOImpl();
    }
}
