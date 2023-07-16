package com.example.flareui.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.flareui.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var bottomnav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        var nav_container = findNavController(R.id.fragmentContainerView)
        bottomnav.setupWithNavController(nav_container)
    }
}