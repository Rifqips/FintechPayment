package io.github.rifqips.fintechpayment.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import io.github.rifqips.fintechpayment.R

class RecoveryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        val kuybaliklagi = findViewById<Toolbar>(R.id.back)
        kuybaliklagi.setOnClickListener{
            val kelogin = Intent(this, LoginActivity::class.java)
            startActivity(kelogin)
        }

    }
}