package com.example.niousha.refugeeapp

/**
* Created by NJafari on 4/9/18.
*/

class VolunteerSlot(internal var volunteer: Volunteer, internal var title: String,
                    internal var description: String, internal var date: String,
                    internal var time: String, internal var location: String) {
    internal var refugeeList: List<Refugee>? = null



}
