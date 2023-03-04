package com.alya.homework_4_6month

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.alya.homework_4_6month.adapter.PagerAdapter
import com.alya.homework_4_6month.databinding.ActivityMainBinding
import com.alya.homework_4_6month.fragments.FirstFragment
import com.alya.homework_4_6month.fragments.SecondFragment
import com.alya.homework_4_6month.fragments.ThirdFragment


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       var myViewPager2 = binding.viewPager2
        myViewPager2.offscreenPageLimit = 3
       var myAdapter = PagerAdapter(supportFragmentManager, lifecycle)




        myAdapter.addFragment(FirstFragment())
        myAdapter.addFragment(SecondFragment())
        myAdapter.addFragment(ThirdFragment())

        myViewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        myViewPager2.adapter = myAdapter
        val indicator = binding.dotsIndicator
        indicator.attachTo(binding.viewPager2)
    }
}