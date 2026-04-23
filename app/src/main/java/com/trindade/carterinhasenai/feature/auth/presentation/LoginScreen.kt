package com.trindade.carterinhasenai.feature.auth.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable

fun LoginScreen (modifier: Modifier = Modifier,
                 onLoginClick: () -> Unit = {}){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Login")
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("email")}
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text("senha")}
        )

        Button(
            onClick = onLoginClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary ,
                contentColor = MaterialTheme.colorScheme.onPrimary
            )
        ) { }
    }

}