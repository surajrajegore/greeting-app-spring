package com.example.greetingappspring.entity;


public class User {


    public int id;
    public String firstName;
    public String lastName;
    public String message;

    public User(int id, String firstName, String lastName, String message) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
