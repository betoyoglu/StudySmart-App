package com.example.studysmartapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.studysmartapp.presentation.dashboard.DashboardScreen
import com.example.studysmartapp.presentation.theme.StudySmartAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudySmartAppTheme {
                DashboardScreen()
            }
        }
    }
}

