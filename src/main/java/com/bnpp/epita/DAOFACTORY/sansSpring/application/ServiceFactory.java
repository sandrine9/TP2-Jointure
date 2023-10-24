package com.bnpp.epita.DAOFACTORY.sansSpring.application;

public class ServiceFactory {

    public static IClientService serviceFactory(){
        return new ClientServiceImpl();
    }
}
