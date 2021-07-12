package io.github.rifqips.fintechpayment.activity

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import io.github.rifqips.fintechpayment.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private var PRIVATE_MODE = 0
    private val PREF_NAME = "Fintech"
    var sharedPref : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sharedPref = this.getSharedPreferences(PREF_NAME, PRIVATE_MODE)

        btnSubmit.setOnClickListener{
            validateAll()
        }

        val klik = findViewById<Button>(R.id.btnSubmit)
        klik.setOnClickListener{
            val kehome = Intent(this, MainActivity::class.java)
            startActivity(kehome)
            Toast.makeText(this, "Success Login", Toast.LENGTH_SHORT).show()
        }

        val pemulihan = findViewById<TextView>(R.id.forgotpw)
        pemulihan.setOnClickListener{
            val recovery = Intent(this, RecoveryActivity::class.java)
            startActivity(recovery)
        }

        val buatakun = findViewById<TextView>(R.id.ctaccount)
        buatakun.setOnClickListener{
            val creataccount = Intent(this, RegisterActivity::class.java)
            startActivity(creataccount)
        }
    }
        private fun validateAll() {
            if (validateName() && validateEmail() && validatePassword()) {
                Toast.makeText(this, "Success", Toast.LENGTH_LONG).show()

                val intent = Intent(this, MainActivity::class.java)
                val editor = sharedPref!!.edit()

                editor.putString("userName", etName.text.toString())
                editor.putString("userEmail", etEmail.text.toString())
                editor.apply()

                startActivity(intent)
            }
        }

        fun validateName() : Boolean{
            if(etName.text.length == 0){
                tvError_name.setText("Name must be filled")
                return false
            } else {
                tvError_name.setText(null)
                return true
            }
        }

        fun validateEmail() : Boolean{
            if(etEmail.text.length == 0){
                tvError_email.setText("Email must be filled")
                return false
            } else if(!Patterns.EMAIL_ADDRESS.matcher(etEmail.text).matches()){
                tvError_email.setText("Enter a required Email")
                return false
            } else {
                tvError_email.setText(null)
                return true
            }
        }

        fun validatePassword() : Boolean{
            if(etPassword.text.length == 0){
                tvError_password.setText("Password must be filled")
                return false
            } else if(etPassword.text.length < 4){
                tvError_password.setText("Password must be 4 characters or more")
                return false
            } else {
                tvError_password.setText(null)
                return true
            }
        }
}
