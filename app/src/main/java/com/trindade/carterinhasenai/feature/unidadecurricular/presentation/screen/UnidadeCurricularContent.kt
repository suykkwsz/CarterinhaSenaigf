package com.trindade.carterinhasenai.feature.unidadecurricular.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trindade.carterinhasenai.feature.unidadecurricular.domain.model.UnidadeCurricular
import com.trindade.carterinhasenai.feature.unidadecurricular.presentation.component.UnidadeCurricularCard

@Composable
fun UnidadeCurricularContent(
    modifier: Modifier = Modifier,
    unidadesCurriculares: List<UnidadeCurricular>
) {

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 16.dp),

        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        items(unidadesCurriculares) { unidadeCurricular ->

            UnidadeCurricularCard(
                unidadeCurricular = unidadeCurricular
            )
        }
    }
}