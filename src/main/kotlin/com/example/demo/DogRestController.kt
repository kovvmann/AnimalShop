package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/dog")

class DogRestController(var dogService: DogService) {
    @GetMapping
    fun getAll() = dogService.findAll()

    @PostMapping
    fun save(@RequestBody dog:Dog): Dog{
        return dogService.save(dog)
    }

}