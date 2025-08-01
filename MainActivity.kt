package com.example.lab2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab2.ui.theme.Lab2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab2Theme {
                Pantalla()
            }
        }
    }
}

@Composable
fun Pantalla() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            text = "App de Ale",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "¡Bienvenido a la aplicación!",
            fontSize = 18.sp
        )

        Button(onClick = {
            Toast
                .makeText(context, "¡click!", Toast.LENGTH_SHORT)
                .show()
        }) {
            Text("Haz click aquí")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MySimpleScreenPreview() {
    Lab2Theme {
        Pantalla()
    }
}