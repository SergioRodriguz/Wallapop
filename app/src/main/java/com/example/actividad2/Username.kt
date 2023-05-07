package com.example.actividad2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Username : AppCompatActivity() {
    private var txtUsername : TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_username)

        txtUsername = findViewById(R.id.txtUsername)

        val dato = intent.getStringExtra("dato")
        txtUsername?.text= dato
    }
}