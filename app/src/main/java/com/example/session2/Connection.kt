package com.example.session2

import android.app.AlertDialog
import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Connection {
    val retrofit = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val api = retrofit.create(API::class.java)
}
fun error(context:Context,title:String,message:String){
    AlertDialog.Builder(context)
        .setNegativeButton("опробовать снова",null)
        .setTitle(title)
        .setMessage(message)
        .show()
}