package com.example.divisordeconta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.Locale

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Desenha na tela a interface escrita com Jetpack Compose.
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TelaDivisorDeConta()
                }
            }
        }
    }
}

@Composable
fun TelaDivisorDeConta() {

    // Variaveis da tela: guardam o que o usuario digita e o resultado do calculo.
    var valorConta by remember { mutableStateOf("") }
    var quantidadePessoas by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(24.dp)) {

        Text(
            text = "Divisor de Conta",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Caixa de texto do valor total da conta.
        TextField(
            value = valorConta,
            onValueChange = { valorConta = it },
            label = { Text("Valor da conta") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Caixa de texto da quantidade de pessoas.
        TextField(
            value = quantidadePessoas,
            onValueChange = { quantidadePessoas = it },
            label = { Text("Quantidade de pessoas") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Botao que faz a divisao quando o usuario toca nele.
        Button(
            onClick = {
                // Converte o texto digitado em numero. Se o texto nao for um
                // numero valido (ou estiver vazio), a conversao devolve null.
                val conta = valorConta.replace(",", ".").toDoubleOrNull()
                val pessoas = quantidadePessoas.toIntOrNull()

                // Condicao logica: so divide quando os dois valores sao validos e a
                // quantidade de pessoas e maior que zero (evita a divisao por zero).
                resultado = if (conta != null && pessoas != null && pessoas > 0) {
                    val valorIndividual = conta / pessoas
                    val valorFormatado = String.format(Locale.forLanguageTag("pt-BR"), "%.2f", valorIndividual)
                    "Cada pessoa paga: R$ $valorFormatado"
                } else {
                    "Digite valores válidos."
                }
            }
        ) {
            Text("Dividir Conta")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Area que mostra o resultado na mesma tela, abaixo do botao.
        Text(
            text = resultado,
            fontSize = 20.sp
        )
    }
}
