package io.github.rifqips.fintechpayment.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import io.github.rifqips.fintechpayment.R
import io.github.rifqips.fintechpayment.fragment.PaymentFragment

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val kuy = findViewById<Toolbar>(R.id.backkuy)
        kuy.setOnClickListener{
            val kelogin = Intent(this, PaymentFragment::class.java)
            startActivity(kelogin)
        }
    }

}