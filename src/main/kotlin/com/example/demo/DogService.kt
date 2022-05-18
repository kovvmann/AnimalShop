package com.example.demo

import org.springframework.stereotype.Service


@Service
class DogService(var dogRepository: DogRepository) {
    fun findAll() = dogRepository.findAll()
    fun save(dog: Dog) = dogRepository.save(dog)
}