package br.com.comptar.guilhermeap2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PerguntasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas)

        val btGoPerguntas2 = findViewById<Button>(R.id.BtnConfirmar)
        btGoPerguntas2.setOnClickListener {
            val intent = Intent(this@PerguntasActivity,Perguntas2Activity::class.java)
            startActivity(intent)
        }
    }
}