package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*

import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType
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

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Digite um Numero Entre 1 a 100:")

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = input,
            onValueChange = { input = it },
            label = { Text("Seu palpite") },
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            val guess = input.toIntOrNull()
            if (guess == null) {
                result = "Digite um número válido"
            } else if (guess < secret) {
                result = "Muito baixo!"
            } else if (guess > secret) {
                result = "Muito alto!"
            } else {
                result = "Você acertou!"
            }
        }) {
            Text("Verificar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = result)
    }
}