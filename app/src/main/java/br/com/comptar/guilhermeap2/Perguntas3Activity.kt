package br.com.comptar.guilhermeap2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perguntas3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas3)

        val btGoPerguntas4 = findViewById<Button>(R.id.BtnConfirmar3)
        btGoPerguntas4.setOnClickListener {
            val intent = Intent(this@Perguntas3Activity, Perguntas4Activity::class.java)
            startActivity(intent)
        }
    }
}