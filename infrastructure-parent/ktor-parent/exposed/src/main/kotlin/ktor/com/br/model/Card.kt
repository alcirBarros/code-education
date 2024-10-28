package ktor.com.br.model

import java.util.UUID

data class Card(
    val id: UUID = UUID.randomUUID(),
    val embossingName: String
)
