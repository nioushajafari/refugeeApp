package com.example.niousha.refugeeapp;

import android.location.Address;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

/**
 * Created by niousha on 4/9/18.
 */

public class VolunteerSlot {
    Volunteer volunteer;
    String title;
    String description;
    Date date;
    Time time;
    Address location;
    List<Refugee> refugeeList;

    public VolunteerSlot(Volunteer volunteer, String title, String description, Date date,
                         Time time, Address location) {
        this.volunteer = volunteer;
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
        this.location = location;
    }

}
