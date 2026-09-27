package com.example.guia8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.guia8.ui.screens.HomeScreen2
import com.example.guia8.ui.theme.Guia8Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            Guia8Theme {
                HomeScreen2()
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Guia8Theme {
        HomeScreen2();
    }
}