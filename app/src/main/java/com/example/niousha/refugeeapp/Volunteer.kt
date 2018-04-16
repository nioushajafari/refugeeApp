package com.example.niousha.refugeeapp

/**
 * Created by niousha on 4/9/18.
 */

class Volunteer(firstName: String, lastName: String, phoneNumber: String, email: String) {
    var firstName: String
        internal set
    var lastName: String
        internal set
    var phoneNumber: String
        internal set
    var email: String
        internal set

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.phoneNumber = phoneNumber
        this.email = email
    }
}
