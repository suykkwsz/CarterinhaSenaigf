package com.trindade.carterinhasenai.feature.auth.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.trindade.carterinhasenai.app.navigation.Routes
import com.trindade.carterinhasenai.feature.auth.presentation.LoginScreen

fun NavGraphBuilder.authScreen(
    OnNavigateToHome: () -> Unit
){
    composable(Routes.Login){
        LoginScreen(
            onLoginClick = OnNavigateToHome
        )
    }
}