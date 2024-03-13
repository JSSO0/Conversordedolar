package com.example.conversordedolar

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textValor = findViewById<EditText>(R.id.textValor)
        val textCotacao = findViewById<EditText>(R.id.textCotacao)
        val button = findViewById<Button>(R.id.button)
        val textResultado = findViewById<TextView>(R.id.textresultado)

        button.setOnClickListener {
            val valor = textValor.text.toString().toFloatOrNull()
            val cotacao = textCotacao.text.toString().toFloatOrNull()

            
            if (valor != null && cotacao != null) {
                val resultado = valor * cotacao
                textResultado.text = resultado.toString()
            } else {
                textResultado.text = "Valores inválidos"
            }
        }
    }
}