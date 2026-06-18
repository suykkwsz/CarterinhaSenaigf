package com.trindade.carterinhasenai.feature.carteirinha.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.trindade.carterinhasenai.app.navigation.Routes
import com.trindade.carterinhasenai.feature.carteirinha.presentation.CarteirinhaScreen
fun NavGraphBuilder.carteirinhaScreen() {
    composable(Routes.Carteirinha) {
        CarteirinhaScreen()
    }
}