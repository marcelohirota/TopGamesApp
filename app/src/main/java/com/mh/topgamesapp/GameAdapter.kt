package com.mh.topgamesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter (val gameList: ArrayList<GameModel>) : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtGame = itemView.findViewById(R.id.cardViewTxt) as TextView
        val imgGame = itemView.findViewById(R.id.cardViewImg) as ImageView

        init {
            itemView.setOnClickListener {
                Toast.makeText(
                    itemView.context,
                    txtGame.text,
                    Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return gameList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val game: GameModel = gameList[position]
        holder.txtGame.text = game.txtCard
        holder.imgGame.setImageResource(game.imgCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout, parent, false)
        return ViewHolder(v)
    }

}