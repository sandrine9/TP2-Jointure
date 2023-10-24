package com.bnpp.epita.DAOFACTORY.sansSpring.application;

import com.bnpp.epita.DAOFACTORY.sansSpring.domaine.Client;
import com.bnpp.epita.DAOFACTORY.sansSpring.infrastructure.DAOFactory;
import com.bnpp.epita.DAOFACTORY.sansSpring.infrastructure.IClientDAO;

public class ClientServiceImpl implements IClientService {
    @Override
    public void create(Client client) {
        IClientDAO clientDAO = DAOFactory.createClientDAO();
        clientDAO.createToBDD(client);
    }
}
