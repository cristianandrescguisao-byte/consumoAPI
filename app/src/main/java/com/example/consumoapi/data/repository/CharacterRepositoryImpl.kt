package com.example.consumoapi.data.repository

import com.example.consumoapi.data.mapper.toDomain
import com.example.consumoapi.data.remote.api.CharacterApiService
import com.example.consumoapi.domain.model.Character
import com.example.consumoapi.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api: CharacterApiService
) : CharacterRepository {
    override suspend fun getCharactersByName(
        name: String
    ): List<Character> {
        val response = api.getCharactersByName(name)
        return response.results.map { characterDto ->
            characterDto.toDomain()
        }
    }
}