package com.josdavs.b306_a21miinterfaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val iniciarInformacion=findViewById<ImageButton>(R.id.btn_Informacion)
        iniciarInformacion.setOnClickListener {
            val activar = Intent(this, MainActivity3::class.java)
            startActivity(activar)
        }

        val iniciarComandos=findViewById<ImageButton>(R.id.btn_Comandos)
        iniciarComandos.setOnClickListener {
            val activar = Intent(this, MainActivity4::class.java)
            startActivity(activar)
        }
    }
}