package com.example.loginscreenjm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun login(view: View) {
        val user = findViewById<EditText>(R.id.login_user).text.toString()
        val contra = findViewById<EditText>(R.id.login_contra).text.toString()

        if(user == "19-0883" && contra == "123456") {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Usuario o Contraseña Incorrecta", Toast.LENGTH_SHORT).show()
        }


        button_reset.setOnClickListener {

            login_user.setText("")
            login_contra.setText("")
        }
    }

}