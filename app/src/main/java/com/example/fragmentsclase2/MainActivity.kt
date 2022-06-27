package com.example.fragmentsclase2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsclase2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)


        b.bnext.setOnClickListener {
            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }
    }
}