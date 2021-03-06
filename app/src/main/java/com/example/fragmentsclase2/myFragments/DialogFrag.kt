package com.example.fragmentsclase2.myFragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.fragmentsclase2.R

class DialogFrag : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        dialog!!.setTitle("Dialog Fragment")
        val view = inflater.inflate(R.layout.fragment_dialog, container, false)
        return view
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(context!!)
            .setMessage(R.string.Borrar)
            .setPositiveButton(R.string.Aceptar) { dialog, id ->
                Toast.makeText(this.context, "Has borrado datos", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancelar") { dialog, id ->
                Toast.makeText(this.context, "Has cancelado el borrado", Toast.LENGTH_SHORT).show()
            }
            .create()
    }
    companion object {
        const val TAG = "Dialogo Confirmado"
    }


}