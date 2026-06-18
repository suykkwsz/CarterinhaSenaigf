package com.trindade.carterinhasenai.feature.home.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.trindade.carterinhasenai.app.navigation.Routes
import com.trindade.carterinhasenai.feature.home.presentation.screen.HomeScreen

fun NavGraphBuilder.homeScreen(
    onNavigateToCarteirinha: () -> Unit,
    onNavigateToComponentes: () -> Unit
){
    composable(Routes.Home) {
        HomeScreen(
            onCarteirinhaClick = onNavigateToCarteirinha,
            onComponentesClick = onNavigateToComponentes
        )
    }
}