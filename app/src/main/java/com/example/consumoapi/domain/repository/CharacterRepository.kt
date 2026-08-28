package com.example.consumoapi.domain.repository

import com.example.consumoapi.domain.model.Character

interface CharacterRepository {
    suspend fun getCharactersByName(
        name: String
    ): List<Character>
}