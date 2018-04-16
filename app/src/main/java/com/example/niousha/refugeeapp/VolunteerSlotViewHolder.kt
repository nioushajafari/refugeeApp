package com.example.niousha.refugeeapp

import android.view.View
import android.widget.TextView
import butterknife.ButterKnife

/**
 * Created by NJafari on 4/10/18.
 */
class VolunteerSlotViewHolder(view: View): GenericRecyclerAdapter.BaseViewHolder(view) {

    fun VolunteerSlotViewHolder(view: View) {
        ButterKnife.bind(this, view)
    }

}