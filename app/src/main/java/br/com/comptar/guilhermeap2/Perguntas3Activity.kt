package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perguntas3Activity : AppCompatActivity() {

    private lateinit var btGoResultado : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas3)

        btGoResultado = findViewById<Button>(R.id.BtnConfirmar3)
        btGoResultado.setOnClickListener {
            val intent = Intent(this@Perguntas3Activity, ResultadoActivity::class.java)
            startActivity(intent)
        }

        val btnCurto : Button = findViewById(R.id.RespCurto)
        btnCurto.setOnClickListener {
            btnCurto.setBackgroundColor(Color.rgb(224, 17, 95))
            btnCurto.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        val btnMedio: Button = findViewById(R.id.RespMedio)
        btnMedio.setOnClickListener {
            btnMedio.setBackgroundColor(Color.rgb(224, 17, 95))
            btnMedio.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        val btnLongo : Button = findViewById(R.id.RespLongo)
        btnLongo.setOnClickListener {
            btnLongo.setBackgroundColor(Color.rgb(224, 17, 95))
            btnLongo.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        val btnSemPref2 : Button = findViewById(R.id.RespSemPref2)
        btnSemPref2.setOnClickListener {
            btnSemPref2.setBackgroundColor(Color.rgb(224, 17, 95))
            btnSemPref2.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }
        desabilitarButtonConfirmarRespoasta()
    }
    private fun HabiltarButtonConfirmarResposta() {
        btGoResultado.setTextColor(Color.BLACK)
        btGoResultado.setBackgroundColor(Color.rgb(40, 180, 99 ))
        btGoResultado.isEnabled = true
    }
    private fun desabilitarButtonConfirmarRespoasta() {
        btGoResultado.setTextColor(Color.WHITE)
        btGoResultado.setBackgroundColor(Color.rgb(98, 101, 103))
        btGoResultado.isEnabled = false
    }
}