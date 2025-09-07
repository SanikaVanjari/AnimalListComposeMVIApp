package com.example.animallistcomposemviapp.api

class AnimalRepo(private val api: AnimalApi) {
    suspend fun getAnimals() = api.getAnimal()
}