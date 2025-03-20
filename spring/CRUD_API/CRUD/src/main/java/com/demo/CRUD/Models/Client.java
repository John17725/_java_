package com.demo.CRUD.Models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "client")
public class Client extends Person {
    @Column(name="client_id")
    private String clientIdentifier;
    protected Client() {}
    public Client(String firstName, String lastName, int age, String dateOfBirth, String address, String email, String phoneNumber) {
        super(firstName, lastName, age, dateOfBirth, address, email, phoneNumber);
        this.clientIdentifier = UUID.randomUUID().toString();
    }

    public String getClientIdentifier() {
        return clientIdentifier;
    }

    public void setClientIdentifier(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
    }
}
