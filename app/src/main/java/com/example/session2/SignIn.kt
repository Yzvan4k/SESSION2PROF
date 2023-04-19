package com.example.session2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.example.session2.databinding.ActivitySignInBinding
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Response

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignInBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val mail = binding.editMail.toString()
            if (mail.isBlank()){
                error(this,"Error","EmptyM ail")
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(mail).matches()){
                error(this,"Error","wrong M ail")
                return@setOnClickListener
            }
            val pass = binding.editPass.toString()
            if (pass.isBlank()){
                error(this,"Error","EmptyM ail")
                return@setOnClickListener
            }
            Connection.api.log(LogB(mail,pass)).enqueue(object :retrofit2.Callback<UserData>{
                override fun onResponse(call: Call<UserData>, response: Response<UserData>) {
                    if (response.isSuccessful){
                        startActivity(Intent(this@SignIn,MainActivity::class.java))
                        finish()
                    }
                    if (response.errorBody()!=null){
                        val error = Gson().fromJson<ErrorBody>(response.errorBody()!!.string(),ErrorBody::class.java)
                        error(this@SignIn,"Error",error.error)}
                }

                override fun onFailure(call: Call<UserData>, t: Throwable) {
                    error(this@SignIn,"Error",t.localizedMessage?:t.message?:"Unknown error")
                }
            })
        }
    }
}