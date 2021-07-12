package io.github.rifqips.fintechpayment.activity

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import io.github.rifqips.fintechpayment.R
import io.github.rifqips.fintechpayment.fragment.SettingFragment
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    val PRIVATE_MODE = 0
    val PREF_NAME = "Fintech"
    var sharedPrefs : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        sharedPrefs = this.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        user_profile_name.setText(sharedPrefs!!.getString("userName", ""))
        user_profile_email.setText(sharedPrefs!!.getString("userEmail", ""))

        val kuykeprofile = findViewById<Toolbar>(R.id.back_profile)
        kuykeprofile.setOnClickListener{
            val kesetting = Intent(this, SettingFragment::class.java)
            startActivity(kesetting)
        }

        val balikregist = findViewById<Toolbar>(R.id.back_profile)
        balikregist.setOnClickListener{
            val keregist = Intent(this, LoginActivity::class.java)
            startActivity(keregist)
        }
    }
}