package br.com.comptar.guilhermeap2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btGoPerguntas1 = findViewById<Button>(R.id.btnFzrQuiz)
        btGoPerguntas1.setOnClickListener {
            val intent = Intent(this@MainActivity,PerguntasActivity::class.java)
            startActivity(intent)
        }
    }
}