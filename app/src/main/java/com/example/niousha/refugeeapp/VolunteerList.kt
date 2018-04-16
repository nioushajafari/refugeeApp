package com.example.niousha.refugeeapp

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import MyAdapter

class VolunteerList : Activity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volunteer_list)

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(initTestVolunteers())

        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }
    }

    private fun initTestVolunteers(): Array<VolunteerSlot> {
        val james: Volunteer = Volunteer("James", "Donald",
                                        "123", "JDonald@gmail.com")

        val jamesSlot: VolunteerSlot = VolunteerSlot(james, "Title", "Description",
                                                    "Date", "Time", "Location")

        val jamesSlot2: VolunteerSlot = VolunteerSlot(james, "Title", "Description",
                "Date", "Time", "Location")

        val jamesSlot3: VolunteerSlot = VolunteerSlot(james, "Title", "Description",
                "Date", "Time", "Location")

        val jamesSlot4: VolunteerSlot = VolunteerSlot(james, "Title", "Description",
                "Date", "Time", "Location")

        return arrayOf(jamesSlot, jamesSlot2, jamesSlot3, jamesSlot4)
    }
}
