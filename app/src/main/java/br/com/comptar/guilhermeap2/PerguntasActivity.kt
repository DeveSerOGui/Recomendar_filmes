package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PerguntasActivity : AppCompatActivity() {

    private lateinit var btGoPerguntas2 : Button
    private var selectedButton: View? = null
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
            selectButton(btnComedia)
            HabiltarButtonConfirmarResposta()
            SharedData.genero = 10
        }

        val btnAcao : Button = findViewById(R.id.RespAcao)
        btnAcao.setOnClickListener {
            selectButton(btnAcao)
            HabiltarButtonConfirmarResposta()
            SharedData.genero = 20
        }

        val btnFicCien : Button = findViewById(R.id.RespFicCien)
        btnFicCien.setOnClickListener {
            selectButton(btnFicCien)
            HabiltarButtonConfirmarResposta()
            SharedData.genero = 30
        }

        val btnTerror : Button = findViewById(R.id.RespTerror)
        btnTerror.setOnClickListener {
            selectButton(btnTerror)
            HabiltarButtonConfirmarResposta()
            SharedData.genero = 40
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
