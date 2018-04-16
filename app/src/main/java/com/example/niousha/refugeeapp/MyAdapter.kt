import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.niousha.refugeeapp.GenericRecyclerAdapter
import com.example.niousha.refugeeapp.R
import com.example.niousha.refugeeapp.VolunteerSlot
import com.example.niousha.refugeeapp.VolunteerSlotViewHolder

class MyAdapter(private val myDataset: Array<VolunteerSlot>) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class ViewHolder(val textView: VolunteerSlotViewHolder) : RecyclerView.ViewHolder(GenericRecyclerAdapter.BaseViewHolder)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val volunteerSlotView = inflater.inflate(R.layout.volunteer_slot, parent, false)
        val volunteerSlotViewHolder = VolunteerSlotViewHolder(volunteerSlotView)

        // create a new view
//        val volunteerSlot = LayoutInflater.from(parent.context)
//                .inflate(R.layout.volunteer_slot, parent, false) as TextView
//


        // set the view's size, margins, paddings and layout parameters

        return ViewHolder(volunteerSlotViewHolder)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
//        holder.textView.text = myDataset[position].title
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}


