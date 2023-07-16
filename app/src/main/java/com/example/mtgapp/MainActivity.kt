package com.example.mtgapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mtgapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        binding.btnnext.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        binding.btnhome.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }

        displayPlayer()
    }

    fun displayPlayer(){
        val player1=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/335060167_636625911634096_3754027134541409389_n.jpg?stp=dst-jpg_p526x296&_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=aepKgGb649AAX-4dUFK&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfDE0hoUOTXhzuMkmpA5w9ER96xWadIP1fzmXQmcKSQB8A&oe=64B12E98","Name:Asia Ali Mwaduna","Gersey Number 1","GoalKeeper")
        val player2=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/344566796_2255785687955720_7527562155055757936_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=dTGWSXfvhXkAX-A9yR9&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfBUt0up3yfXCOsgdRSWFqYIpv_7pbRxsAGEBZ4oWKX30A&oe=64B24BA7","Name:Kaluwa Pascal Karimiko","GerseyNumber 12","Fullback2")
        val player3=Playeradata("https://scontent.fnbo9-1.fna.fbcdn.net/v/t39.30808-6/344739271_1941061169563863_223881334257615369_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=tyPolsYgu38AX9o-gKa&_nc_ht=scontent.fnbo9-1.fna&oh=00_AfA2aXf36yeAWTLfe_cMryroqpWYoSaW2dxXqj_kIYN7LA&oe=64B25025","Name:Zipporah Faida","Gersey Number1 8","Fullback3")
       val  player4=Playeradata("https://scontent.fnbo9-1.fna.fbcdn.net/v/t39.30808-6/325414398_930818038086502_1664606566553389573_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=730e14&_nc_ohc=9ekMgvx6dSQAX83S0em&_nc_ht=scontent.fnbo9-1.fna&oh=00_AfCprWoOKmUyjp9vPUo024tAI_2zbhbumiuT-QNmiEyPUw&oe=64B169CF","Name:Mapenzi Mariam Changwa","Gersey Number 5","Fullback5")
        val player5=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/291932492_5386387518092443_2227720760184728631_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=730e14&_nc_ohc=yBIgbH_U92gAX915JBn&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfBORqVj7jaLlzz1wmpdccfxVTBaHyr9HGxJaQpQ_b4J7A&oe=64B1F050","Name:Vallary Mwanaidi Karisa","Gersey Number 4","Fullback4")
        val player6=Playeradata("https://scontent.fnbo9-1.fna.fbcdn.net/v/t39.30808-6/344799490_312890694667550_1655751077201824953_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=5uv3uQRXQC8AX_yZ5z-&_nc_ht=scontent.fnbo9-1.fna&oh=00_AfARYByJ2pleIHF9hSrQrxy0PnHlFbfEzagX9CJQf3kqdw&oe=64B14729","Name:Florida Sidhani Bokole","Gersey Number 6","Mid 6")
        val player7=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/331731568_1339927033461428_6739231862173180286_n.png?_nc_cat=101&ccb=1-7&_nc_sid=730e14&_nc_ohc=YajWHVrxCTkAX8fMX5c&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfDTPcYYPsMNKVNc2eHFxNIZq8H7-S5bgUAwRJqKyQ2piQ&oe=64B12D9A","Name:Mariam Samini Daniel","Gersey Number 7","Winger7")
        val player8=Playeradata("https://scontent.fnbo9-1.fna.fbcdn.net/v/t39.30808-6/344731075_787163676088039_7765962454668422408_n.jpg?_nc_cat=103&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=IHVq37BnvWYAX8yIgKz&_nc_ht=scontent.fnbo9-1.fna&oh=00_AfDkM5KqxTJz9EEbpCilRGr9CitZjOeveN0Th-7tuEtscA&oe=64B20E27","Name:Jesca Pendo Kazungu","Gersey Number 8","Mid8")
        val player9=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/331729761_166499792826664_681850012364887808_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=730e14&_nc_ohc=Rh6taRmVzL0AX9tQtsq&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfC5YiQ4i97GlaHetNaaBm-lpVXGaBzyH_CVhbdddqk3XQ&oe=64B1B43E","Name:Rita Mwanaisha Nindala","Gersey Number 15","Striker")
        val player10=Playeradata("https://scontent.fnbo9-1.fna.fbcdn.net/v/t39.30808-6/331940840_746265440402117_4268400337067146520_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=UP3rTsBwynIAX_kL4Fz&_nc_ht=scontent.fnbo9-1.fna&oh=00_AfDDaZj0ThZ5i18nwCTMDZ6GUtSnGT7Qk-7TgiaUrO5zLA&oe=64B2AF9F","Name:Salama Ali Gaone","Gersey Number 10","Mid 10")
        val player11=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/293115826_893957311548294_2806705572566722587_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=730e14&_nc_ohc=IYFtg6gOibYAX-oXew9&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfDneISDWZG0fUvitV-H2pCWyMf0-jZJnqE-DbYqOtmFTA&oe=64B27782","Name:Mercy Masika","Gersey Number 11","Winder11")
        val player12=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/348447191_954489212565414_2028925887790565980_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=6DiNphFmO1cAX-dTW3x&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfCVe6hi3nNWLVPvDi3PAK2JsmfQHgugj19Z0kC3LVq-Xw&oe=64B16A4B","Name:Alvin Khalenyi","Gersey Number 14","Mid 8")
        val player13=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/297818844_5463383950392799_4854873030818278578_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=730e14&_nc_ohc=RiC6xKLPiLMAX_y3iaK&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfArsP5rcjqWKD1o9UV1lePO98KlA_bUz76MP_T84dpPnQ&oe=64B1662D","Name:Eunice Santa Kahindi","Gersey Number 2","mid8")
        val player14=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/293404031_5421459214585273_6247088428032263984_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=fWy3nzDsxR8AX9VH8Q8&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfAcRiWDHv70dM_67VBcIRuvjKX3S-V6lFNkecsoAIWa7Q&oe=64B1DD4F","Name:Christine Kaingu","Gersey Number 3","Fullback3")
        val player15=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/346842648_588287556701831_6331027420313265584_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=bCtOkVCo0F8AX_nQILo&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfDrCUO6ckLtdGY52T2-ZYao0nn5fKebwRePsLTfx9lgzA&oe=64B2190C","Name:WinnieFrida Raymond","Gersey Number 22","Striker")
        val player16=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/347263547_1420317292133811_7037615235720287601_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=xgH3xbz65LUAX-OoxTp&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfDTzrjH5yejaSX7NKaGkBYZFHdwv4EOSfY5RF98MwxYaQ&oe=64B288C1","Name:Regina Kadzo","Gersey Number 18","Striker")
        val player17=Playeradata("https://scontent.fnbo10-1.fna.fbcdn.net/v/t39.30808-6/347120325_988607558803036_5352853059583778063_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=VgbRA9PSMR4AX_ZbWdu&_nc_ht=scontent.fnbo10-1.fna&oh=00_AfAhwOVEaVoFCh_1uoYw98RFM33ZgkKkxxAXbCwcKk23gw&oe=64B19288","Name:Sara Kahindi","Gersey Number 31","Goalkeeper")
        val player18=Playeradata("https://scontent.fnbo9-1.fna.fbcdn.net/v/t39.30808-6/323290434_5725450764234317_8723716744643396496_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=v61xfOFomRIAX8luuuW&_nc_ht=scontent.fnbo9-1.fna&oh=00_AfCpJkBqItb2pSZULpYZ6sFFdJVWJBtjt814h2NYq0ZHew&oe=64B1B0E2","Name:Rehema Changawa","Gersey Number 16","Striker")
        val player19=Playeradata("https://scontent.fnbo9-1.fna.fbcdn.net/v/t39.30808-6/348230626_797136441603409_8174945521907237187_n.jpg?_nc_cat=100&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=sWIFYf5CNmMAX-950V1&_nc_ht=scontent.fnbo9-1.fna&oh=00_AfA1Vios878GN9G_tnFzp41GYMZHyqvNLbkDCys3AtwxjQ&oe=64B2A2E4","Name:Margaret Rehema","Gersey Number 17","Striker")


        val playerlist= listOf(player1,player2,player3,player4,player5,player6,player7,player8,player9,player10,player11,player12,player13,player14,player15,player16,player17,player18,player19)
        val plyerAdapter=PlayerAdapter(playerlist)

        binding.rvrecycler.layoutManager=LinearLayoutManager(this)
        binding.rvrecycler.adapter=plyerAdapter
    }
}



