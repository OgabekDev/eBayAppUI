package dev.ogabek.ebayappui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.ebayappui.R
import dev.ogabek.ebayappui.adapter.FavouriteAdapter
import dev.ogabek.ebayappui.model.Favourite

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_main)

        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = manager

        refreshAdapter(getFavorites())
    }

    private fun refreshAdapter(favorites: java.util.ArrayList<Favourite>) {
        val adapter = FavouriteAdapter(this, favorites)
        recyclerView.adapter = adapter
    }

    private fun getFavorites(): ArrayList<Favourite> {
        val list: ArrayList<Favourite> = ArrayList()

        list.add(Favourite("iWatch", R.drawable.i_watch))
        list.add(Favourite("iPhone", R.drawable.i_phone))
        list.add(Favourite("iWatch", R.drawable.i_watch))
        list.add(Favourite("iPhone", R.drawable.i_phone))
        list.add(Favourite("iWatch", R.drawable.i_watch))
        list.add(Favourite("iPhone", R.drawable.i_phone))
        list.add(Favourite("iWatch", R.drawable.i_watch))
        list.add(Favourite("iPhone", R.drawable.i_phone))
        list.add(Favourite("iWatch", R.drawable.i_watch))
        list.add(Favourite("iPhone", R.drawable.i_phone))
        list.add(Favourite("iWatch", R.drawable.i_watch))
        list.add(Favourite("iPhone", R.drawable.i_phone))
        list.add(Favourite("iWatch", R.drawable.i_watch))
        list.add(Favourite("iPhone", R.drawable.i_phone))
        list.add(Favourite("iWatch", R.drawable.i_watch))
        list.add(Favourite("iPhone", R.drawable.i_phone))

        return list
    }
}