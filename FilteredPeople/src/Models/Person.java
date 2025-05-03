package Models;

import Exception.*;

import Enums.Gender;
public class Person {
    private String name;
    private int age;
    private Gender gender;
    private String email;
    private String city;

    public Person(String name, int age, Gender gender, String email, String city) throws InvalidGenderException, EmailInvalidException {
        if(gender != Gender.MALE && gender != Gender.FEMALE) {
            throw new InvalidGenderException();
        }

        if(!email.contains("@")){
            throw new EmailInvalidException("The email need '@'");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Name: "+name+", Age: "+age+", Gender: "+gender+", Email: "+email+", City: "+city;
    }
}
