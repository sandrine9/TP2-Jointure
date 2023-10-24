package com.bnpp.epita.DAOFACTORY.sansSpring.infrastructure;

import com.bnpp.epita.DAOFACTORY.sansSpring.domaine.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SessionFactoryImpl;

public class ClientDAOImpl implements IClientDAO {


    @Override
    public void createToBDD(Client client) {
        SessionFactory sessionFactory = DAOFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(client);
        session.getTransaction().commit();
        session.close();
    }


}
