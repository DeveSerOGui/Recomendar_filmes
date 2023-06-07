package br.com.comptar.guilhermeap2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Perguntas2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perguntas2)

        val btGoPerguntas3 = findViewById<Button>(R.id.BtnConfirmar2)
        btGoPerguntas3.setOnClickListener {
            val intent = Intent(this@Perguntas2Activity, Perguntas3Activity::class.java)
            startActivity(intent)
        }
    }
}