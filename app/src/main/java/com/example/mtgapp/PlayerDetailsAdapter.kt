package com.example.mtgapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mtgapp.databinding.PlayerDetailsListBinding
import com.squareup.picasso.Picasso

class PlayerDetailsAdapter(var playerList:List<PlayerDetails>): RecyclerView.Adapter<PlayerDetailsViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerDetailsViewHolder {
        val binding=PlayerDetailsListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return PlayerDetailsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    override fun onBindViewHolder(holder: PlayerDetailsViewHolder, position: Int) {
        val currentdetailsplayer=playerList.get(position)
        val binding=holder.binding
        binding.tvstatus.text=currentdetailsplayer.status
        binding.tvoccupation.text=currentdetailsplayer.occupation
        binding.tvemailAddress.text=currentdetailsplayer.emailAddress
        binding.tvphoneNumber.text=currentdetailsplayer.phoneNumber
        binding.tvlevelOfEducation.text=currentdetailsplayer.levelOfEducation
        binding.tvawardswon.text=currentdetailsplayer.awardsWon
        binding.tvyearsOfExperience.text=currentdetailsplayer.maxDaysOfPractice
        binding.tvmaxdaysOfPractice.text=currentdetailsplayer.maxDaysOfPractice
        binding.tvfield.text=currentdetailsplayer.field
        binding.tvskills.text=currentdetailsplayer.skills
        binding.tvdivision.text=currentdetailsplayer.division
        binding.tvage.text=currentdetailsplayer.age


        Picasso
            .get()
            .load(currentdetailsplayer.image)

            .placeholder(R.drawable.baseline_person_outline_24)
            .error(R.drawable.baseline_person_outline_24)
            .into(binding.imageView7)



    }
}
class PlayerDetailsViewHolder(var binding: PlayerDetailsListBinding):RecyclerView.ViewHolder(binding.root){
}