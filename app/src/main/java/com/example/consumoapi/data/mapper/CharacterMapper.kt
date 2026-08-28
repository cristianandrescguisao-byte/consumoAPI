package com.example.consumoapi.data.mapper

import com.example.consumoapi.data.remote.dto.CharacterDto
import com.example.consumoapi.domain.model.Character

fun CharacterDto.toDomain(): Character {
    return Character(
        id = id,
        name = name,
        status = status,
        species = species,
        gender = gender,
        originName = origin.name,
        locationName = location.name,
        image = image
    )
}