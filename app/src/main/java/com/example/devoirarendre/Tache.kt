package com.example.devoirarendre

import androidx.compose.ui.graphics.Color

data class Tache(
    val id: Int,
    val title: String,
    val color: Color = Color.Red
)