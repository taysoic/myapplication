package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyActivity()
        }
    }
}

@Composable
fun MyActivity() {
    var secret by remember { mutableStateOf(Random.nextInt(1, 101)) }
    var input by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }
    var attempts by remember { mutableStateOf(0) }
    var ranking by remember { mutableStateOf(listOf<Int>()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Digite um Número Entre 1 a 100:")

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = input,
            onValueChange = { input = it },
            label = { Text("Seu palpite") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            val guess = input.toIntOrNull()
            if (guess == null) {
                result = "Digite um número válido"
            } else {
                attempts++
                when {
                    guess < secret -> result = "Muito baixo!"
                    guess > secret -> result = "Muito alto!"
                    else -> {
                        result = "Você acertou em $attempts tentativas!"
                        ranking = (ranking + attempts).sorted()
                        attempts = 0
                        secret = Random.nextInt(1, 101)
                    }
                }
            }
            input = ""
        }) {
            Text("Verificar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = result)

        Spacer(modifier = Modifier.height(32.dp))

        Text("Ranking dos Melhores Jogos", fontWeight = FontWeight.Bold)

        LazyColumn(
            modifier = Modifier.fillMaxHeight(0.4f)
        ) {
            items(ranking) { attempt ->
                Text("Tentativas: $attempt")
            }
        }
    }
}
