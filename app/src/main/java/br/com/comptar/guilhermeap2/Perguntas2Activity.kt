package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Perguntas2Activity : AppCompatActivity() {

    private lateinit var btGoPerguntas3 : Button
    private var selectedButton: View? = null
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
            selectButton(btnAntigo)
            HabiltarButtonConfirmarResposta()
            SharedData.lancamento = 10
        }

        val btnRecente : Button = findViewById(R.id.RespRecente)
        btnRecente.setOnClickListener {
            selectButton(btnRecente)
            HabiltarButtonConfirmarResposta()
            SharedData.lancamento = 20
        }

        val btnSemPref2: Button = findViewById(R.id.RespSemPref2)
        btnSemPref2.setOnClickListener {
            selectButton(btnSemPref2)
            HabiltarButtonConfirmarResposta()
            SharedData.lancamento = 30
        }
        desabilitarButtonConfirmarRespoasta()
    }

    private fun selectButton(button: Button) {
        selectedButton?.apply {
            setBackgroundColor(Color.rgb(197,63,63))
        }

        button.setBackgroundColor(Color.rgb(224, 17, 95))
        button.setTextColor(Color.WHITE)
        selectedButton = button
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