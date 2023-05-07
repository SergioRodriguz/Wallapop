package com.example.actividad2


import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.TextElementListener
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginUser : AppCompatActivity() {

    private lateinit var txtUser : EditText
    private lateinit var terms: TextView
    private lateinit var privacy: TextView

    private fun openUrl(url: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(this, "No se pudo abrir el enlace", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_user)

        val btnLogin2 : Button = findViewById(R.id.button5)
        val password : TextView = findViewById(R.id.TextPassword)
        val username : TextView = findViewById(R.id.TextEmailAddress)
        terms = findViewById(R.id.Terms)
        privacy = findViewById(R.id.Privacy)
        txtUser = findViewById(R.id.TextEmailAddress)
        val aux = ""

        terms.setOnClickListener {
            openUrl("http://www.google.com")
        }

        privacy.setOnClickListener {
            openUrl("https://www.twitch.tv")
        }

        btnLogin2.setOnClickListener {
            if (password.text.toString()==aux && username.text.toString()==aux){
            }
            else {
                val intent1 = Intent(this, Username::class.java)
                startActivity(intent1)
                var dato = txtUser.text.toString()
                var intento = Intent(this,Username::class.java)
                intento.putExtra("dato",dato)
                startActivity(intento)
            }
        }
    }
}