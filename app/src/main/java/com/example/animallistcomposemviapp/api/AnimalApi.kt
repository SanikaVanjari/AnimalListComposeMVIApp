package com.example.animallistcomposemviapp.api

import com.example.animallistcomposemviapp.model.Animal
import retrofit2.http.GET

interface AnimalApi {
    @GET(value = "animals.json")
    suspend fun getAnimal(): List<Animal>
}