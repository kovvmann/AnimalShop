package com.example.demo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


interface CatRepository: CrudRepository<Cat, String> {


}