package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Perguntas3Activity : AppCompatActivity() {

    private lateinit var btGoResultado : Button
    private var selectedButton: View? = null
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
            selectButton(btnCurto)
            HabiltarButtonConfirmarResposta()
        }

        val btnMedio: Button = findViewById(R.id.RespMedio)
        btnMedio.setOnClickListener {
            selectButton(btnMedio)
            HabiltarButtonConfirmarResposta()
        }

        val btnLongo : Button = findViewById(R.id.RespLongo)
        btnLongo.setOnClickListener {
            selectButton(btnLongo)
            HabiltarButtonConfirmarResposta()
        }

        val btnSemPref2 : Button = findViewById(R.id.RespSemPref2)
        btnSemPref2.setOnClickListener {
            selectButton(btnSemPref2)
            HabiltarButtonConfirmarResposta()
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