package com.litton.jetpack0813.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.litton.jetpack0813.R

class MyNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_navigation)
        val findNavController = Navigation.findNavController(this, R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this,findNavController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val findNavController = Navigation.findNavController(this, R.id.fragment)
        return findNavController.navigateUp()
    }

}