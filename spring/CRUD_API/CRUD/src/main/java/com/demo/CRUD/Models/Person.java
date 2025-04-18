package com.demo.CRUD.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person")
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message="firstName is required")
    @Size(min=5, max=20, message="First name must be between 3 and 50 characters.")
    private String firstName;

    @NotNull(message="lastName is required")
    @Size(min=5, max=20, message="Last name must be between 3 and 50 characters.")
    private String lastName;
    @NotNull(message="age is required")
    @Min(value = 18, message = "Must be over 18 years old")
    @Max(value = 99, message = "Are you sure you're alive?")
    private int age;
    private String dateOfBirth;
    private String address;
    private String email;
    private String phoneNumber;

    protected Person() {}

    public Person(String firstName, String lastName, int age, String dateOfBirth, String address, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private String getFullName() {
        return firstName + " " + lastName;
    }
}
