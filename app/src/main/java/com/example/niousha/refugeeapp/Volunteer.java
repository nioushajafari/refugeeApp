package com.example.niousha.refugeeapp;

/**
 * Created by niousha on 4/9/18.
 */

public class Volunteer {
    String firstName;
    String lastName;
    String phoneNumber;
    String email;

    public Volunteer(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
