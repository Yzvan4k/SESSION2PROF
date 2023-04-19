package com.example.session2

data class UserData(
    val user:ModelUser,
    val token:String
)
data class ModelUser(
    val id:Int,
    val firstname:String,
    val lastname:String,
    val patronymic:String,
    val sex:String,
    val dateBirthDay:String,
    val email:String
)
data class LogB(
    val email:String,
    val password:String
)
data class RegB(
    val firstname:String,
    val lastname:String,
    val patronymic:String,
    val sex:String,
    val dateBirthDay:String,
    val email:String,
    val password: String
)
data class ErrorBody(
    val error: String
)