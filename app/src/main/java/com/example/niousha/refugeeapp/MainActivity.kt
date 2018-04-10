package com.example.niousha.refugeeapp

import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.view.View


/**
 * Created by njafari on 2/25/18.
 */

class MainActivity : Activity() {

    override fun onCreate(savedInstances: Bundle?) {
        super.onCreate(savedInstances)
        setContentView(R.layout.login)
    }

    fun refugeeLoginClicked(view: View) {
        val intent = Intent(this, VolunteerList::class.java)
        startActivity(intent)
    }

}
