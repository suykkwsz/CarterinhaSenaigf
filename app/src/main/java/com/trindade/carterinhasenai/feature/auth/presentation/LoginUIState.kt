package com.trindade.carterinhasenai.feature.auth.presentation

import com.trindade.carterinhasenai.feature.auth.domain.model.UsuarioLogado

data class LoginUIState (
    val usuario: String ="",
    val senha: String ="",
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val usuarioLogado: UsuarioLogado? = null
){
    val loginRealizado: Boolean
        get() = usuarioLogado != null
}