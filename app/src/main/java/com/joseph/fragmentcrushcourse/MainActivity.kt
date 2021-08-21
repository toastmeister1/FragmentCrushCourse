package com.joseph.fragmentcrushcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.joseph.bottomnavwithfragmenttransaction.FragmentA
import com.joseph.bottomnavwithfragmenttransaction.FragmentB
import com.joseph.fragmentcrushcourse.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addFragmentsWithAddToBackStack()
    }

    // 프래그먼트를 AddToBackStack 없이 추가
    fun addFragmentsWithOutAddToBackStack() {
        fragmentManager.commit {
            add(R.id.container, FragmentA(), "A")
        }

        fragmentManager.commit {
            add(R.id.container, FragmentB(), "B")
        }
    }

    // 프래그먼트를 AddToBackStack 과 함께 추가
    fun addFragmentsWithAddToBackStack() {
        fragmentManager.commit {
            add(R.id.container, FragmentA(), "A")
            addToBackStack("A")
        }

        fragmentManager.commit {
            add(R.id.container, FragmentB(), "B")
            addToBackStack("B")
        }
    }
}