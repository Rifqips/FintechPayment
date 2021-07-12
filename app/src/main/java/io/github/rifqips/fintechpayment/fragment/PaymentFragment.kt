package io.github.rifqips.fintechpayment.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import io.github.rifqips.fintechpayment.R
import io.github.rifqips.fintechpayment.activity.PaymentActivity

class PaymentFragment : Fragment(){


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_payment_fragment,container,false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val kuykepayment = view?.findViewById<TextView>(R.id.here)
        kuykepayment.setOnClickListener{
            val kepayment = Intent(context,PaymentActivity::class.java)
            startActivity(kepayment)
        }
    }
}