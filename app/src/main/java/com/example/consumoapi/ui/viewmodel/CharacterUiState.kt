package com.example.consumoapi.ui.viewmodel

import com.example.consumoapi.domain.model.Character

data class CharacterUiState(
    val isLoading: Boolean = false,
    val characters: List<Character> = emptyList(),
    val errorMessage: String? = null
)
