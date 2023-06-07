package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerguntasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        val btnComedia : Button = findViewById(R.id.RespComedia)
        btnComedia.setOnClickListener {
            btnComedia.setBackgroundColor(Color.WHITE)
            btnComedia.setTextColor(Color.BLACK)
        }

        val btnAcao : Button = findViewById(R.id.RespAcao)
        btnAcao.setOnClickListener {
            btnAcao.setBackgroundColor(Color.WHITE)
            btnAcao.setTextColor(Color.BLACK)
        }

        val btnFicCien : Button = findViewById(R.id.RespFicCien)
        btnFicCien.setOnClickListener {
            btnFicCien.setBackgroundColor(Color.WHITE)
            btnFicCien.setTextColor(Color.BLACK)
        }

        val btnTerror : Button = findViewById(R.id.RespTerror)
        btnTerror.setOnClickListener {
            btnTerror.setBackgroundColor(Color.WHITE)
            btnTerror.setTextColor(Color.BLACK)
        }

        val btGoPerguntas2 = findViewById<Button>(R.id.BtnConfirmar)
        btGoPerguntas2.setOnClickListener {
            val intent = Intent(this@PerguntasActivity, Perguntas2Activity::class.java)
            startActivity(intent)
        }
    }
}
