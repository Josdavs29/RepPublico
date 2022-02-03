package com.josdavs.b306_a21miinterfaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.mipmap.ic_launcher)


        val iniciar=findViewById<Button>(R.id.inicioSesion)
        iniciar.setOnClickListener {
            val activar = Intent(this, MainActivity2::class.java)
            startActivity(activar)
        }
    }
}