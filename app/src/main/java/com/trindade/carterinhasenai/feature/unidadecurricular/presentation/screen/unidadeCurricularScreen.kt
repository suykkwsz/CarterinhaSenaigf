package com.trindade.carterinhasenai.feature.unidadecurricular.presentation.screen

import androidx.compose.runtime.Composable
import com.trindade.carterinhasenai.feature.unidadecurricular.data.dataSource
import com.trindade.carterinhasenai.feature.unidadecurricular.domain.model.UnidadeCurricular

@Composable

fun UnidadeCurricularScreen(){
    val unidadesCurriculares = dataSource()

    UnidadeCurricularContent(
        unidadesCurriculares = unidadesCurriculares
    )
}