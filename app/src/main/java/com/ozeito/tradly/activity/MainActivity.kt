package com.ozeito.tradly.activity

import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import com.ozeito.tradly.R
import com.ozeito.tradly.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_browse, R.id.navigation_store, R.id.navigation_history, androidx.appcompat.R.id.progress_circular
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    binding.txtTitle.text = getString(R.string.title_home)
                }
                R.id.navigation_browse -> {
                    binding.txtTitle.text = getString(R.string.title_browse)
                }
                R.id.navigation_store -> {
                    binding.txtTitle.text = getString(R.string.title_store)
                }
                R.id.navigation_history -> {
                    binding.txtTitle.text = getString(R.string.title_history)
                }
                R.id.navigation_profile -> {
                    binding.txtTitle.text = getString(R.string.title_profile)
                }
            }
            true
        }
    }
}