package com.example.boasvindas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Liga esta Activity ao layout activity_main.xml.
        setContentView(R.layout.activity_main)

        // Localiza no layout os componentes que serao usados pelo codigo.
        val etNome: EditText = findViewById(R.id.etNome)
        val btnOk: Button = findViewById(R.id.btnOk)
        val tvSaudacao: TextView = findViewById(R.id.tvSaudacao)

        // Define o que acontece quando o usuario toca no botao OK.
        btnOk.setOnClickListener {
            // Le o texto digitado e remove espacos no inicio e no fim.
            val nome = etNome.text.toString().trim()

            tvSaudacao.text = if (nome.isEmpty()) {
                getString(R.string.saudacao_sem_nome)
            } else {
                // Monta "Ola <nome>!" com o nome realmente digitado.
                getString(R.string.saudacao_formato, nome)
            }
        }
    }
}
