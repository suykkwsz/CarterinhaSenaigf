package com.trindade.carterinhasenai.feature.home.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onCarteirinhaClick: () -> Unit = {},
    onComponentesClick: () -> Unit = {}
) {
    val darkBlue = Color(0xFF0D2B55)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Button(
            onClick = onCarteirinhaClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = darkBlue,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(8.dp), // menos arredondado
            modifier = Modifier.size(160.dp)
        ) {
            Text("Carteirinha", textAlign = TextAlign.Center)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onComponentesClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = darkBlue,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.size(160.dp)
        ) {
            Text("Componentes Curriculares", textAlign = TextAlign.Center)
        }
    }
}