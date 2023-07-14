package com.example.top_navigation_drawer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    lateinit var drawerLayout:DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //drawer layout instance to toggle the menu icon to open  and close drawer
        drawerLayout = findViewById(R.id.mydrawerlayout)

        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)

        //Pass toggle button  for drawer layout listener
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        //Make the navigation drawer icon to always appear on the action bar
        supportActionBar?. setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (actionBarDrawerToggle.onOptionsItemSelected(item)){true}
        else
        super.onOptionsItemSelected(item)
    }

}
