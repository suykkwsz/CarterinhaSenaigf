package com.trindade.carterinhasenai.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.trindade.carterinhasenai.feature.auth.navigation.authScreen
import com.trindade.carterinhasenai.feature.carteirinha.navigation.carteirinhaScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Login
    ) {

        authScreen {
            navController.navigate(Routes.Carteirinha)
        }

        carteirinhaScreen(
            onNavigateToLogin = {
                navController.navigate(Routes.Carteirinha)
            }
        )
    }
}