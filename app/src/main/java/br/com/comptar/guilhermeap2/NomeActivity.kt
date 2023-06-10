package br.com.comptar.guilhermeap2

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nome)

            val btnContinuar: Button = findViewById(R.id.btnFzrQuiz)
            btnContinuar.setOnClickListener {
                val editTextNomeInformado: EditText = findViewById(R.id.TextUsernameInput)
                val nomeInformado = editTextNomeInformado.text.toString().trim()
                if (nomeInformado.isNotEmpty() && nomeInformado != "Insira um nome!" ){
                    val intent = Intent(this@NomeActivity, PerguntasActivity::class.java)
                    intent.putExtra("name", nomeInformado)
                    startActivity(intent)
                } else {
                    editTextNomeInformado.setTextColor(Color.WHITE)
                    editTextNomeInformado.error = "Você deve inserir um nome para prosseguir"
                    editTextNomeInformado.setTextSize(18f)
                    editTextNomeInformado.setOnClickListener {
                        editTextNomeInformado.setText("")
                        editTextNomeInformado.setTextColor(Color.WHITE)
                        editTextNomeInformado.setTextSize(24f)
                    }
                }
            }
        }
    }