package com.example.devoirarendre

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: TacheViewModel by viewModels()

        setContent {
            MaterialTheme {
                NavGraph(viewModel)
            }
        }
    }
}