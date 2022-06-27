package com.example.fragmentsclase2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
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

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fCV,frag3)
            //Añade el fragmento a la pila de actividad
            addToBackStack(null)
            commit()
        }
        b.b3frag.setOnClickListener { setFragmentAnim(frag3) }
        b.b4Frag.setOnClickListener { setFragmentAnim(frag4) }
        b.b5frag.setOnClickListener { setFragmentAnim(frag5) }

//       b.b3frag.setOnClickListener {   supportFragmentManager.beginTransaction().apply {    //esta es la manera de hacer que cambie cada vez que pulso su boton
//            replace(R.id.fCV, frag3)
//            addToBackStack(null)
//            commit()
//        }}
//        b.b4Frag.setOnClickListener {   supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fCV, frag4)
//            addToBackStack(null)
//            commit()
//        }}
//        b.b5frag.setOnClickListener {   supportFragmentManager.beginTransaction().apply {
//            replace(R.id.fCV, frag5)
//            addToBackStack(null)
//            commit()
//        }}
    }
    fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply { //FUncion para no tener que poner todo lo que he comentado arriba
            replace(R.id.fCV, fragment)
            //Añade añade el fragmento a la pila de actividad
            addToBackStack(null)
            commit()
        }
    }

    fun setFragmentAnim(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .setCustomAnimations(
                R.anim.slide_in, // enter
                R.anim.fade_out, // exit
                R.anim.fade_in,  // popEnter
                R.anim.slide_out // popExit
            )
            .replace(R.id.fCV,fragment)
            .commit()
    }
//    fun onClickDialog(view: View){
//        DialogFragment().show(supportFragmentManager, DialogFragment.TAG)
//    }
    fun clickNext(view: View){
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}


