package com.example.demo

import org.springframework.data.repository.CrudRepository

interface DogRepository: CrudRepository<Dog, Int> {

}