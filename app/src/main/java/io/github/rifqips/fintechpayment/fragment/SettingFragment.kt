package io.github.rifqips.fintechpayment.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import io.github.rifqips.fintechpayment.R
import io.github.rifqips.fintechpayment.activity.PaymentActivity
import io.github.rifqips.fintechpayment.activity.ProfileActivity

class SettingFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_setting_fragment,container,false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val kuybalikkeprofile = view?.findViewById<TextView>(R.id.title_profile)
        kuybalikkeprofile.setOnClickListener{
            val keprofile = Intent(context, ProfileActivity::class.java)
            startActivity(keprofile)
        }
    }
}