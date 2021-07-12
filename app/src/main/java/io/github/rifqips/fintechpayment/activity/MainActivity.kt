package io.github.rifqips.fintechpayment.activity

import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import io.github.rifqips.fintechpayment.R
import io.github.rifqips.fintechpayment.fragment.HistoryFragment
import io.github.rifqips.fintechpayment.fragment.HomeFragment
import io.github.rifqips.fintechpayment.fragment.PaymentFragment
import io.github.rifqips.fintechpayment.fragment.SettingFragment

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title=resources.getString(R.string.Home)
        loadFragment(HomeFragment())

        navigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigation_home-> {
                    title=resources.getString(R.string.Home)
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_history-> {
                    title=resources.getString(R.string.History)
                    loadFragment(HistoryFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_payment-> {
                    title=resources.getString(R.string.Payment)
                    loadFragment(PaymentFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.navigation_setting-> {
                    title=resources.getString(R.string.Setting)
                    loadFragment(SettingFragment())
                    return@setOnNavigationItemSelectedListener true
                }

            }
            false

        }
    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
