package com.example.niousha.refugeeapp

import android.support.v7.widget.RecyclerView
import android.view.View
import java.util.ArrayList

/**
 * Created by NJafari on 4/10/18.
 */
abstract class GenericRecyclerAdapter : RecyclerView.Adapter<GenericRecyclerAdapter.BaseViewHolder>() {
    private val items = ArrayList<BaseRecyclerItem>()

    init {
        setHasStableIds(true)
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].itemViewType
    }

    override fun getItemId(position: Int): Long {
        return items[position].itemId
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun addItem(item: BaseRecyclerItem) {
        items.add(item)
        notifyItemInserted(items.size - 1)
    }

    fun removeItem(item: BaseRecyclerItem) {
        // Can't just call items.remove(item) because we won't know the right index for notify call
        val position = items.indexOf(item)
        if (position > 0) {
            notifyItemRemoved(position)
            items.removeAt(position)
        }
    }

    fun removeItem(itemId: Long) {
        for (i in items.indices) {
            val item = items[i]
            if (item.itemId == itemId) {
                items.remove(item)
                notifyItemRemoved(i)
                return
            }
        }
    }

    fun addItems(newItems: Collection<BaseRecyclerItem>) {
        val oldSize = items.size
        items.addAll(newItems)
        notifyItemRangeInserted(oldSize, newItems.size)
    }

    fun clearItems() {
        notifyItemRangeRemoved(0, items.size)
        items.clear()
    }

    fun setItems(items: List<BaseRecyclerItem>) {
        clearItems()
        addItems(items)
    }

    protected fun getItems(): List<BaseRecyclerItem> {
        return items
    }

    abstract class BaseRecyclerItem {
        abstract val itemViewType: Int

        abstract val itemId: Long
    }

    open class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
