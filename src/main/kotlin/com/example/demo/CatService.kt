package com.example.demo

import org.springframework.stereotype.Service

@Service
class CatService (var catRepository: CatRepository){
    fun findAll()=catRepository.findAll()
    fun save(cat: Cat)=catRepository.save(cat)
}