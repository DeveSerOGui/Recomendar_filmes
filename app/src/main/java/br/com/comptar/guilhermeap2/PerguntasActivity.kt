package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerguntasActivity : AppCompatActivity() {

    private lateinit var btGoPerguntas2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        btGoPerguntas2 = findViewById<Button>(R.id.BtnConfirmar)
        btGoPerguntas2.setOnClickListener {
            val intent = Intent(this@PerguntasActivity, Perguntas2Activity::class.java)
            startActivity(intent)
        }

        val btnComedia : Button = findViewById(R.id.RespComedia)
        btnComedia.setOnClickListener {
            btnComedia.setBackgroundColor(Color.rgb(224, 17, 95))
            btnComedia.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        val btnAcao : Button = findViewById(R.id.RespAcao)
        btnAcao.setOnClickListener {
            btnAcao.setBackgroundColor(Color.rgb(224, 17, 95))
            btnAcao.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        val btnFicCien : Button = findViewById(R.id.RespFicCien)
        btnFicCien.setOnClickListener {
            btnFicCien.setBackgroundColor(Color.rgb(224, 17, 95))
            btnFicCien.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        val btnTerror : Button = findViewById(R.id.RespTerror)
        btnTerror.setOnClickListener {
            btnTerror.setBackgroundColor(Color.rgb(224, 17, 95))
            btnTerror.setTextColor(Color.BLACK)
            HabiltarButtonConfirmarResposta()
        }

        desabilitarButtonConfirmarRespoasta()

    }

    private fun HabiltarButtonConfirmarResposta() {
        btGoPerguntas2.setTextColor(Color.BLACK)
        btGoPerguntas2.setBackgroundColor(Color.rgb(40, 180, 99 ))
        btGoPerguntas2.isEnabled = true
    }
    private fun desabilitarButtonConfirmarRespoasta() {
        btGoPerguntas2.setTextColor(Color.WHITE)
        btGoPerguntas2.setBackgroundColor(Color.rgb(98, 101, 103))
        btGoPerguntas2.isEnabled = false
    }
}
