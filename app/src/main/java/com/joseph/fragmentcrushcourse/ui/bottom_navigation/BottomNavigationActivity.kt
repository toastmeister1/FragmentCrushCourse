package com.joseph.fragmentcrushcourse.ui.bottom_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.joseph.fragmentcrushcourse.FragmentA
import com.joseph.fragmentcrushcourse.FragmentB
import com.joseph.fragmentcrushcourse.FragmentC
import com.joseph.fragmentcrushcourse.R
import com.joseph.fragmentcrushcourse.databinding.ActivityBottomNavigationBinding
import timber.log.Timber

class BottomNavigationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavigationBinding
    private val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBottomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeBottomNavigation()
    }

    private fun initializeBottomNavigation() {
        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            Timber.tag("[BottomNavigationActivity]").d(fragmentManager.backStackEntryCount.toString())
            when (menuItem.itemId) {
                R.id.fragmentA -> {
                    replaceFragment(FragmentA())
                    return@setOnItemSelectedListener true
                }
                R.id.fragmentB -> {
                    replaceFragment(FragmentB())
                    return@setOnItemSelectedListener true
                }
                R.id.fragmentC -> {
                    replaceFragment(FragmentC())
                    return@setOnItemSelectedListener true
                }
                else -> return@setOnItemSelectedListener false
            }
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        fragmentManager.commit {
            replace(R.id.container, fragment)
        }
    }

    override fun onBackPressed() = with(binding) {
        if (bottomNavigationView.selectedItemId != R.id.fragmentA) {
            bottomNavigationView.selectedItemId = R.id.fragmentA
            fragmentManager.commit {
                replace(R.id.container, FragmentA())
            }
        } else {
            super.onBackPressed()
        }
    }
}