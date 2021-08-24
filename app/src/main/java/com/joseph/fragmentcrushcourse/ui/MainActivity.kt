package com.joseph.fragmentcrushcourse.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joseph.fragmentcrushcourse.databinding.ActivityMainBinding
import com.joseph.fragmentcrushcourse.ui.bottom_navigation.BottomNavigationActivity
import com.joseph.fragmentcrushcourse.util.startActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeButtonListener()
    }

    private fun initializeButtonListener() = with(binding) {
        bottomNavigationButton.setOnClickListener {
            startActivity<BottomNavigationActivity>(this@MainActivity)
        }
    }
}

