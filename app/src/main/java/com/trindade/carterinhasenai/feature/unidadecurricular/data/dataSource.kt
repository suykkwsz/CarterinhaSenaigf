package com.trindade.carterinhasenai.feature.unidadecurricular.data

import com.trindade.carterinhasenai.feature.unidadecurricular.domain.model.UnidadeCurricular

fun dataSource (): List<UnidadeCurricular>{
    return listOf(
        UnidadeCurricular(
            id = "1",
            nome = "Matemática",
            professor = "Einstein",
            nota1 = 8.5,
            nota2 = 9.0,
            media = 10.0,
            faltas = 18
        ),

        UnidadeCurricular(
            id = "2",
            nome = "Matemática",
            professor = "Einstein",
            nota1 = 1.0,
            nota2 = 6.0,
            media = 3.5,
            faltas = 12
        ),

        UnidadeCurricular(
            id = "3",
            nome = "Matemática",
            professor = "Einstein",
            nota1 = 4.5,
            nota2 = 3.5,
            media = 4.0,
            faltas = 2
        )
    )
}