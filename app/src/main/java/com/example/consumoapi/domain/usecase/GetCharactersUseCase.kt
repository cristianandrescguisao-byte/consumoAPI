package com.example.consumoapi.domain.usecase

import com.example.consumoapi.domain.model.Character
import com.example.consumoapi.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(
        name: String
    ): List<Character> {
        return repository.getCharactersByName(name)
    }
}