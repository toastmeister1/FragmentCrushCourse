package com.joseph.fragmentcrushcourse

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.commit
import com.joseph.fragmentcrushcourse.databinding.ActivityMainBinding
import com.joseph.fragmentcrushcourse.util.startActivity
import kotlinx.coroutines.NonCancellable.start
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
            startActivity<BottomNavigationActivity>(this@MainActivity)
        }
    }
}

