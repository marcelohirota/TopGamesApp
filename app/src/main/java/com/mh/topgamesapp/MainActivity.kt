package com.mh.topgamesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // AdapterView
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)

        // Data Source - List of games
        var gameList = ArrayList<GameModel>()

        val g1 = GameModel(R.drawable.card1, "Horizon Chase")
        val g2 = GameModel(R.drawable.card2, "PUBG")
        val g3 = GameModel(R.drawable.card3, "Head Ball 2")
        val g4 = GameModel(R.drawable.card4, "Hooked on You")
        val g5 = GameModel(R.drawable.card5, "Fifa 2022")
        val g6 = GameModel(R.drawable.card6, "Fortnite")

        gameList.add(g1)
        gameList.add(g2)
        gameList.add(g3)
        gameList.add(g4)
        gameList.add(g5)
        gameList.add(g6)

        // Adapter - connecting data source to the view
        val adapter = GameAdapter(gameList)
        recyclerView.adapter = adapter


    }
}

