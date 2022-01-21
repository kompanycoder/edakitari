package com.example.edakitari.ui.user

import android.content.ContentValues.TAG
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.edakitari.R

class SignIn() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
        val googleSignInButton: Button = findViewById(R.id.google_sign_btn)
        googleSignInButton.setOnClickListener { v ->
            Log.d(TAG, "Google sign IN btn clicked: $v")
        }
    }
    override fun onResume() {
        super.onResume()
//        check if user instance is loggedIn then push user to profile/ services

    }
//    Add google signIn button
//    add logic for signing in user
//    if user instance is present, push to profile or home

}
