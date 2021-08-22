package com.joseph.fragmentcrushcourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.joseph.fragmentcrushcourse.databinding.ActivityMainBinding
import timber.log.Timber

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
            val intent = Intent(this@MainActivity, BottomNavigationActivity::class.java)
            startActivity(intent)
        }
    }
}