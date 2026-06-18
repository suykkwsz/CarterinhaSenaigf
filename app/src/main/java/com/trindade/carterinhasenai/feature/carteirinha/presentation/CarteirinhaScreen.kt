package com.trindade.carterinhasenai.feature.carteirinha.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trindade.carterinhasenai.feature.carteirinha.component.QrCode
import com.trindade.carterinhasenai.R

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.fillMaxSize()
            .background(Color.Black)
    ) {
        Image(
            painter = painterResource(id = R.drawable.senai_logo),
            contentDescription = "Logo do Senai"
        )

        Image(
            painter = painterResource( id = R.drawable.eu),
            contentDescription = "Aluno",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Text(text = "Nome: ",
                fontSize = 15.sp)
            Text(text = "Pedro B.Trindade",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Text(text = "Curso: ",
                fontSize = 15.sp)
            Text(text = "Desenvolvimento de Sistemas",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        QrCode(
            "90000000001755897986",
            modifier = Modifier
                .border(
                    width = 2.dp,
                    Color.Red
                )
        )
    }
}
