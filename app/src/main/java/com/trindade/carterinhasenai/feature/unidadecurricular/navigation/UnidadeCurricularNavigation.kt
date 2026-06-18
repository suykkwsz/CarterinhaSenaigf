package com.trindade.carterinhasenai.feature.unidadecurricular.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.trindade.carterinhasenai.app.navigation.Routes
import com.trindade.carterinhasenai.feature.unidadecurricular.presentation.screen.UnidadeCurricularScreen

fun NavGraphBuilder.componentesScreen() {
    composable(Routes.Componentes) {
        UnidadeCurricularScreen()
    }
}