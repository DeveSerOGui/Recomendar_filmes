package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perguntas2Activity : AppCompatActivity() {

    private lateinit var btGoPerguntas3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas2)

        btGoPerguntas3 = findViewById<Button>(R.id.BtnConfirmar2)
        btGoPerguntas3.setOnClickListener {
            val intent = Intent(this@Perguntas2Activity, Perguntas3Activity::class.java)
            startActivity(intent)
        }

        val btnAntigo : Button = findViewById(R.id.RespAntigo)
        btnAntigo.setOnClickListener {
            btnAntigo.setBackgroundColor(Color.rgb(224, 17, 95))
            btnAntigo.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        val btnRecente : Button = findViewById(R.id.RespRecente)
        btnRecente.setOnClickListener {
            btnRecente.setBackgroundColor(Color.rgb(224, 17, 95))
            btnRecente.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        val btnSemPref2: Button = findViewById(R.id.RespSemPref2)
        btnSemPref2.setOnClickListener {
            btnSemPref2.setBackgroundColor(Color.rgb(224, 17, 95))
            btnSemPref2.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }
        desabilitarButtonConfirmarRespoasta()
    }

    private fun HabiltarButtonConfirmarResposta() {
        btGoPerguntas3.setTextColor(Color.BLACK)
        btGoPerguntas3.setBackgroundColor(Color.rgb(40, 180, 99 ))
        btGoPerguntas3.isEnabled = true
    }
    private fun desabilitarButtonConfirmarRespoasta() {
        btGoPerguntas3.setTextColor(Color.WHITE)
        btGoPerguntas3.setBackgroundColor(Color.rgb(98, 101, 103))
        btGoPerguntas3.isEnabled = false
    }
}