package io.github.rifqips.fintechpayment.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import io.github.rifqips.fintechpayment.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val kuybalikelogin = findViewById<Toolbar>(R.id.back)
        kuybalikelogin.setOnClickListener{
            val kelogin = Intent(this, LoginActivity::class.java)
            startActivity(kelogin)
        }
    }
}