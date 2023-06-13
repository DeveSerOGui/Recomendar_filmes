package br.com.comptar.guilhermeap2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val nomeInformado = intent.getStringExtra("name")
        val nome : TextView = findViewById(R.id.Username)
        nome.text = "$nomeInformado"


        //var btGoIMDB = findViewById<Button>(R.id.ButtonIMBD)
        //btGoIMDB.setOnClickListener {
        //    val url = Uri.parse("https://www.imdb.br")
        //    val intent = Intent(Intent.ACTION_VIEW, url)
        //    startActivity(intent)
        //}

        //var ResultadoGenero : String = PerguntasActivity().Genero

        //var ResultadoLancamento : String = Perguntas2Activity().data

        //var ResultadoDuracao : String = Perguntas3Activity().duracao
    }
}