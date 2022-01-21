package com.example.edakitari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
//import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Main activity", "Main activity Ran successfully")
        val signUpButton: Button = findViewById(R.id.sign_up)
        signUpButton.setOnClickListener {
            val someMessage = "Yes its working, proceed!!!"
            Log.i("SignUp click Listener", "Clicked: $someMessage")
        }
//        signIn btn
        val signInButton: Button = findViewById(R.id.sign_in)
        signInButton.setOnClickListener {
            val someMessage2 = "Yes its working, proceed!!!"
            Log.i("SignUp click Listener", "Clicked: $someMessage2")
        }
    }
}