package com.josdavs.b306_a21miinterfaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val arrayAdapter:ArrayAdapter<*>

        val comandos = mutableListOf("Hola","Chiste","Clima","Hora")
        val lista = findViewById<ListView>(R.id.lista)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,comandos)
        lista.adapter = arrayAdapter
    }
}