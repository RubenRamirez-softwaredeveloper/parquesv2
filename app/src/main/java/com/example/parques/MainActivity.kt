package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val miDialogo = MiDialogFragment()


        binding.bGuardar.setOnClickListener{
            Log.d("Nombre", binding.nombre.text.toString())
            Log.d("Descripción", binding.descripcion.text.toString())
            Log.d("Teléfono", binding.telefono.text.toString())
            Log.d("Web", binding.web.text.toString())

            if (binding.cbDeportes.isChecked) Log.d("Deportes", binding.cbDeportes.text.toString())
            if (binding.cbParqueInfantil.isChecked) Log.d("Parque infantil", binding.cbParqueInfantil.text.toString())
            if (binding.cbRestaurante.isChecked) Log.d("Restaurante", binding.cbRestaurante.text.toString())
            if (binding.cbZonaMascotas.isChecked) Log.d("Zona de mascotas", binding.cbZonaMascotas.text.toString())

            Log.d("Hora de apertura", binding.spinnerHApertura.selectedItem.toString())
            Log.d("Hora de cierre", binding.spinnerHCierre.selectedItem.toString())
            miDialogo.show(supportFragmentManager, "MiDialogo")

        }
    }
}