package com.example.studysmartapp.util

import androidx.compose.ui.graphics.Color
import com.example.studysmartapp.presentation.theme.Green
import com.example.studysmartapp.presentation.theme.Orange
import com.example.studysmartapp.presentation.theme.Red

enum class Priority (val title: String, val color: Color, val value: Int){
    LOW(title = "low", color= Green, value=0),
    MEDIUM(title = "medium", color= Orange, value=1),
    HIGH(title = "high", color= Red, value=2);

    companion object{
        fun fromInt(value:Int) = values().firstOrNull{it.value == value } ?: MEDIUM
    }
}