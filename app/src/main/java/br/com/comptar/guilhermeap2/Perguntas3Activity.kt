package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perguntas3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas3)

        val btnCidade : Button = findViewById(R.id.RespCidade)
        btnCidade.setOnClickListener {
            btnCidade.setBackgroundColor(Color.rgb(224, 17, 95))
            btnCidade.setTextColor(Color.BLACK)
        }

        val btnRural : Button = findViewById(R.id.RespRural)
        btnRural.setOnClickListener {
            btnRural.setBackgroundColor(Color.rgb(224, 17, 95))
            btnRural.setTextColor(Color.BLACK)
        }

        val btnEspaco: Button = findViewById(R.id.RespEspaco)
        btnEspaco.setOnClickListener {
            btnEspaco.setBackgroundColor(Color.rgb(224, 17, 95))
            btnEspaco.setTextColor(Color.BLACK)
        }

        val btGoPerguntas4 = findViewById<Button>(R.id.BtnConfirmar3)
        btGoPerguntas4.setOnClickListener {
            val intent = Intent(this@Perguntas3Activity, Perguntas4Activity::class.java)
            startActivity(intent)
        }
    }
}