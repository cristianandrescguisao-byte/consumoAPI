package com.example.consumoapi.data.remote.api

import com.example.consumoapi.data.remote.dto.CharacterResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApiService {
    @GET("character")
    suspend fun getCharactersByName(
        @Query("name") name: String
    ): CharacterResponseDto
}