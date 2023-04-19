package com.example.session2

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface API {
    @POST("signIn")
    fun log(@Body b:LogB):Call<UserData>
    @POST("signUp")
    fun reg(@Body b:RegB):Call<UserData>

}