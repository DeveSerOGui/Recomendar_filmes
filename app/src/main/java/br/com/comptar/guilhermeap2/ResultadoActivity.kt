package br.com.comptar.guilhermeap2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nomeInformado = intent.getStringExtra("name")
        val nome : TextView = findViewById(R.id.Username)
        nome.text = "$nomeInformado"

        //var ResultadoGenero : String = PerguntasActivity().Genero

        //var ResultadoLancamento : String = Perguntas2Activity().data

        //var ResultadoDuracao : String = Perguntas3Activity().duracao
    }
}