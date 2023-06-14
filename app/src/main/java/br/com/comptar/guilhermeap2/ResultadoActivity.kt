package br.com.comptar.guilhermeap2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)


        val nome : TextView = findViewById(R.id.Username)
        nome.text = "${SharedData.nome}, de acordo com suas respostas te recomendamos:"


        val btGoIMDB = findViewById<ImageButton>(R.id.ButtonIMBD)
        btGoIMDB.setOnClickListener {
            val url = Uri.parse("https://www.imdb.com/")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }

        //Comedia
        if (SharedData.genero == 10){
            if(SharedData.lancamento == 10){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="O Gordo e o Magro\n"+
                                "O Poderoso Chefão\n"+
                                "Amarcord"
            }
            if(SharedData.lancamento == 20){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="Gente grande\n"+
                                "Esposa de Mentirinha\n"+
                                "Se beber não case"
            }
            if(SharedData.lancamento == 30){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="O Gordo e o Magro\n"+
                                "O Poderoso Chefão\n"+
                                "Amarcord\n"+
                                "Gente grande\n"+
                                "Esposa de Mentirinha\n"+
                                "Se beber não case"
            }
        }
        //Açao
        if (SharedData.genero == 20){
            if(SharedData.lancamento == 10){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="007: O Amanhã Nunca Morre\n"+
                                "Difícil de Matar\n"+
                                "Missão: Impossível"
            }
            if(SharedData.lancamento == 20){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="Top Gun: Maverick\n"+
                                "A Origem\n"+
                                "John Wick 3"
            }
            if(SharedData.lancamento == 30){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="007: O Amanhã Nunca Morre\n"+
                                "Difícil de Matar\n"+
                                "Missão: Impossível\n"+
                                "Top Gun\n"+
                                "A Origem\n"+
                                "John Wick 3"
            }
        }
        //FicCienc
        if (SharedData.genero == 30){
            if(SharedData.lancamento == 10){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="Star Wars: Episódio IV\n"+
                                "Robocop - O Policial do Futuro\n"+
                                "Independence Day"
            }
            if(SharedData.lancamento == 20){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="Duna\n"+
                                "Interestelar\n"+
                                "Avatar: O Caminho da Água"

            }
            if(SharedData.lancamento == 30){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="Star Wars: Episódio IV\n"+
                                "Robocop - O Policial do Futuro\n"+
                                "Independence Day\n"+
                                "Duna\n"+
                                "Interestelar\n"+
                                "Avatar: O Caminho da Água"
            }
        }

        //Terror
        if (SharedData.genero == 40){
            if(SharedData.lancamento == 10){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="Panico 1\n"+
                                "Massacre da serra eletrica\n"+
                                "A Hora do Pesadelo"
            }
            if(SharedData.lancamento == 20){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="A Morte do Demônio: A Ascensão\n"+
                                "Pânico 6\n"+
                                "Disappointment Blvd"
            }
            if(SharedData.lancamento == 30){
                val nomeFilme : TextView = findViewById(R.id.Resultado)
                nomeFilme.text ="Panico 1\n"+
                                "Massacre da serra eletrica\n"+
                                "A Hora do Pesadelo\n"+
                                "A Morte do Demônio: A Ascensão\n"+
                                "Pânico 6\n"+
                                "Disappointment Blvd"
            }
        }
//        val filmesComedia = listOf(
//            filmeC("O Gordo e o Magro", "Curto", "Antigo"),
//            filmeC("O Poderoso Chefão", "Medio", "Antigo"),
//            filmeC("Amarcord", "Longo", "Antigo"),
//            filmeC("Gente grande", "Curto", "Recente"),
//            filmeC("Esposa de Mentirinha", "Medio", "Recente"),
//            filmeC("se beber nao case", "Longo", "Recente"),
//        )
//
//        val filmesTerror = listOf(
//            filmeT("Panico 1", "Curto", "Antigo"),
//            filmeT("Massacre da serra eletrica", "Medio", "Antigo"),
//            filmeT("A Hora do Pesadelo", "Longo", "Antigo"),
//            filmeT("A Morte do Demônio: A Ascensão", "Curto", "Recente"),
//            filmeT("Pânico 6", "Medio", "Recente"),
//            filmeT("Disappointment Blvd", "Longo", "Recente"),
//        )
//
//        val filmesAcao = listOf(
//            filmeA("007: O Amanhã Nunca Morre ", "Curto", "Antigo"),
//            filmeA("Difícil de Matar", "Medio", "Antigo"),
//            filmeA("Missão: Impossível", "Longo", "Antigo"),
//            filmeA("Top Gun: Maverick", "Curto", "Recente"),
//            filmeA("A Origem", "Medio", "Recente"),
//            filmeA("John Wick 3", "Longo", "Recente"),
//        )
//
//        val filmesFic = listOf(
//            filmeF("Star Wars: Episódio IV", "Curto", "Antigo"),
//            filmeF("Robocop - O Policial do Futuro", "Medio", "Antigo"),
//            filmeF("ndependence Day", "Longo", "Antigo"),
//            filmeF("Duna", "Curto", "Recente"),
//            filmeF("Interestelar", "Medio", "Recente"),
//            filmeF("Avatar: O Caminho da Água", "Longo", "Recente"),
//        )
    }
}