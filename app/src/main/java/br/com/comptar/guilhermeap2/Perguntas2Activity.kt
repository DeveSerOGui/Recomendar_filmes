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
            btnRecente.setBackgroundColor(Color.rgb(224, 17, 95))
            btnRecente.setTextColor(Color.BLACK)
        }

        val btnAntigo : Button = findViewById(R.id.RespAntigo)
        btnAntigo.setOnClickListener {
            btnAntigo.setBackgroundColor(Color.rgb(224, 17, 95))
            btnAntigo.setTextColor(Color.BLACK)
        }

        val btnSemPref: Button = findViewById(R.id.RespSemPref1)
        btnSemPref.setOnClickListener {
            btnSemPref.setBackgroundColor(Color.rgb(224, 17, 95))
            btnSemPref.setTextColor(Color.BLACK)
        }

        val btGoPerguntas3 = findViewById<Button>(R.id.BtnConfirmar2)
        btGoPerguntas3.setOnClickListener {
            val intent = Intent(this@Perguntas2Activity, Perguntas3Activity::class.java)
            startActivity(intent)
        }
    }
}