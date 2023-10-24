package com.bnpp.epita.DAOFACTORY.sansSpring;

import com.bnpp.epita.DAOFACTORY.sansSpring.application.ClientServiceImpl;
import com.bnpp.epita.DAOFACTORY.sansSpring.application.IClientService;
import com.bnpp.epita.DAOFACTORY.sansSpring.application.ServiceFactory;
import com.bnpp.epita.DAOFACTORY.sansSpring.domaine.Adresse;
import com.bnpp.epita.DAOFACTORY.sansSpring.domaine.Client;
import com.bnpp.epita.DAOFACTORY.sansSpring.infrastructure.DAOFactory;

public class Main {
    public static void main(String[] args) {

        Adresse adresse1 = new Adresse("12 rue Petit", "75012", "Paris");
        Client client1 = new Client("Moulin", "Jean", adresse1);

        //appel ClientService  avec un Client Factory (faire une classe ServiceFactory)
        IClientService service = ServiceFactory.serviceFactory();
        //IClientService service = DAOFactory.createClientService();
        //appel methode create
        service.create(client1);
        //-> comme ça, ne sait pas si à la création du Cleint, si il doit aussi créer l'adresse
        //-> annotation (cascade = pour lui dire de créer l'adresse quand on crée le client

    }
}