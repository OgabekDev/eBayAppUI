package dev.ogabek.ebayappui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.ebayappui.R
import dev.ogabek.ebayappui.model.Favourite

class FavouriteAdapter(val context: Context, val items: ArrayList<Favourite>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_favourite, parent, false)
        return FavouriteViewHolder(view)
    }

    class FavouriteViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.tv_title)
        val image: ImageView = view.findViewById(R.id.iv_image)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is FavouriteViewHolder) {
            holder.apply {
                title.text = item.title
                image.setImageResource(item.image)
            }
        }
    }

    override fun getItemCount() = items.size
}