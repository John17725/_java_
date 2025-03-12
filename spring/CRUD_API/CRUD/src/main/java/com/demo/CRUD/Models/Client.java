package com.demo.CRUD.Models;

public class Client extends Person {
    private int idClient;


    public Client(int idClient, String firstName, String lastName) {
        super(firstName, lastName);
        this.idClient = idClient;
    }

    public int getIdClient() {
        return idClient;
    }

}
