package com.blessednafula.mytweet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class TweetrvAdapter(var contactsList: List<tweeter>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.tweet_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactsList.get(position)
        holder.tvName.text=currentContact.Name
        holder.tvHandle.text=currentContact.handle
        holder.tvTweets.text=currentContact.Tweets



    }

    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweets=itemView.findViewById<TextView>(R.id.tvTweets)





}
