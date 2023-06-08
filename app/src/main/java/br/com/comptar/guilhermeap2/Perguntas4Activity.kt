package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perguntas4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas4)

        val btnCurto : Button = findViewById(R.id.RespCurto)
        btnCurto.setOnClickListener {
            btnCurto.setBackgroundColor(Color.rgb(224, 17, 95))
            btnCurto.setTextColor(Color.BLACK)
        }

        val btnMedio: Button = findViewById(R.id.RespMedio)
        btnMedio.setOnClickListener {
            btnMedio.setBackgroundColor(Color.rgb(224, 17, 95))
            btnMedio.setTextColor(Color.BLACK)
        }

        val btnLongo : Button = findViewById(R.id.RespLongo)
        btnLongo.setOnClickListener {
            btnLongo.setBackgroundColor(Color.rgb(224, 17, 95))
            btnLongo.setTextColor(Color.BLACK)
        }

        val btnSemPref2 : Button = findViewById(R.id.RespSemPref2)
        btnSemPref2.setOnClickListener {
            btnSemPref2.setBackgroundColor(Color.rgb(224, 17, 95))
            btnSemPref2.setTextColor(Color.BLACK)
        }

        val btGoResultado = findViewById<Button>(R.id.BtnConfirmar4)
        btGoResultado.setOnClickListener {
            val intent = Intent(this@Perguntas4Activity, ResultadoActivity::class.java)
            startActivity(intent)
        }
    }
}