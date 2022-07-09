package com.blessednafula.mytweet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.blessednafula.mytweet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()

    }
    fun displayContacts(){
        var tweet=tweeter("Simon","@simon_Silo","Up and Thankful","keep going",20,3,"")
        var tweet1=tweeter("Phanuel","@Phanuel_phan","Any time you feel like giving up,remember why you started","35",15,12,"")
        var tweet2 =tweeter("Leah","@leah_lee","Coding be my daily game","indeed",62,25,"")
        var tweet3=tweeter("Lawrance","@Lawrance_sif","If destiny allows me to be there,I will take care of  those  who cared me","",12,30,"")
        var tweet4=tweeter("Becky","@Becky_shee","Up and thankful","Gratefula always",15,22,"")



        var contactLIst=listOf(tweet,tweet1,tweet2,tweet3,tweet4)
        var contactRvAdapter=TweetrvAdapter(contactLIst)
        binding.rvTweet.layoutManager= LinearLayoutManager(this)
        binding.rvTweet.adapter=contactRvAdapter
    }
}





