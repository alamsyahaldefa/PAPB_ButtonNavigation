package com.example.papb9

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.papb9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur listener untuk Bottom Navigation
        binding.buttonNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Navigasi ke HomeActivity
                    startActivity(Intent(this, HomeActivity::class.java))
                    true
                }
                R.id.notif -> {
                    // Navigasi ke NotifActivity
                    startActivity(Intent(this, NotifActivity::class.java))
                    true
                }
                R.id.profile -> {
                    // Navigasi ke LoginActivity
                    startActivity(Intent(this, LoginActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
