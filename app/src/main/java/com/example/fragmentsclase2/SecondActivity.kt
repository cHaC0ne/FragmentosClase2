package com.example.fragmentsclase2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentsclase2.databinding.ActivitySecondBinding
import myFragments.cuartoFrag
import myFragments.quintoFrag
import myFragments.tercerFrag

class SecondActivity : AppCompatActivity() {
    private lateinit var b: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(b.root)
        val frag3 = tercerFrag() //lleva () porque estoy llamando a una clase
        val frag4 = cuartoFrag()
        val frag5 = quintoFrag()
       b.b3frag.setOnClickListener {   supportFragmentManager.beginTransaction().apply {    //esta es la manera de hacer que cambie cada vez que pulso su boton
            replace(R.id.fCV, frag3)
            addToBackStack(null)
            commit()
        }}
        b.b4Frag.setOnClickListener {   supportFragmentManager.beginTransaction().apply {
            replace(R.id.fCV, frag4)
            addToBackStack(null)
            commit()
        }}
        b.b5frag.setOnClickListener {   supportFragmentManager.beginTransaction().apply {
            replace(R.id.fCV, frag5)
            addToBackStack(null)
            commit()
        }}
    }
}