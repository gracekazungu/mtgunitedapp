package com.example.mtgapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.mtgapp.databinding.PlayerListBinding
import com.squareup.picasso.Picasso

class PlayerAdapter(var playerlist:List<Playeradata>):RecyclerView.Adapter<PlayerViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val binding=
            PlayerListBinding.inflate(LayoutInflater.from(parent.context), parent, false )
        return PlayerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return playerlist.size
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val currentplayer=playerlist.get(position)
        val binding=holder.binding
        binding.tvname.text=currentplayer.name
        binding.tvgerseynumber.text=currentplayer.GerseyNumber
        binding.tvfieldnumber.text=currentplayer.fieldNumber


        Picasso
            .get()
            .load(currentplayer.avatar)

            .placeholder(R.drawable.baseline_person_outline_24)
            .error(R.drawable.baseline_person_outline_24)
            .into(binding.imageView)



   }
}
class PlayerViewHolder(var binding: PlayerListBinding):RecyclerView.ViewHolder(binding.root){
}












