package com.trindade.carterinhasenai.app

import androidx.compose.runtime.Composable
import com.example.compose.CarterinhaSenaiTheme
import com.trindade.carterinhasenai.app.navigation.AppNavHost

@Composable
fun App(){
    CarterinhaSenaiTheme() {
        AppNavHost()
    }
}