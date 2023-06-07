package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perguntas2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas2)

        val btnRecente : Button = findViewById(R.id.RespRecente)
        btnRecente.setOnClickListener {
            btnRecente.setBackgroundColor(Color.WHITE)
            btnRecente.setTextColor(Color.BLACK)
        }

        val btnAntigo : Button = findViewById(R.id.RespAntigo)
        btnAntigo.setOnClickListener {
            btnAntigo.setBackgroundColor(Color.WHITE)
            btnAntigo.setTextColor(Color.BLACK)
        }

        val btnSemPref: Button = findViewById(R.id.RespSemPref1)
        btnSemPref.setOnClickListener {
            btnSemPref.setBackgroundColor(Color.WHITE)
            btnSemPref.setTextColor(Color.BLACK)
        }

        val btGoPerguntas3 = findViewById<Button>(R.id.BtnConfirmar2)
        btGoPerguntas3.setOnClickListener {
            val intent = Intent(this@Perguntas2Activity, Perguntas3Activity::class.java)
            startActivity(intent)
        }
    }
}