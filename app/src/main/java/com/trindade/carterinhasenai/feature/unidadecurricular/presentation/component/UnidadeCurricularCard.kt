package com.trindade.carterinhasenai.feature.unidadecurricular.presentation.component



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trindade.carterinhasenai.feature.unidadecurricular.domain.model.UnidadeCurricular


@Composable
fun UnidadeCurricularCard(
    modifier: Modifier = Modifier,
    unidadeCurricular: UnidadeCurricular
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(all = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {


            Text(
                text =unidadeCurricular.nome,
                style = MaterialTheme.typography.titleLarge
            )
            Text(
                text ="Professor: ${unidadeCurricular.professor}",
                style = MaterialTheme.typography.bodyMedium
            )
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("N1: ${unidadeCurricular.nota1}")
                Text("N2: ${unidadeCurricular.nota2}")
                Text("Média: ${unidadeCurricular.media}")
            }
            Text(
                text ="Faltas: ${unidadeCurricular.faltas}",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary
            )


        }
    }
}


@Preview(showBackground = true)
@Composable
fun UnidadeCurricularCardPreview() {
    UnidadeCurricularCard(
        unidadeCurricular = UnidadeCurricular(
            id = "1",
            nome = "Matemática",
            professor = "Einstein",
            nota1 = 8.5,
            nota2 = 9.0,
            media = 10.0,
            faltas = 18
        )
    )
}

