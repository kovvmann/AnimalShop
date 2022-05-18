package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/cat")
class CatRestController(var catService: CatService) {
//    GET http://localhost:9090/api/cat
//    [
//    {
//        "id": "1",
//        "name": "Tom",
//        "age": 10
//    },
//    {
//        "id": "2",
//        "name": "alise",
//        "age": 15
//    }
//    ]
    @GetMapping
    fun getAll()=catService.findAll()

//    POST http://localhost:9090/api/cat
//    Content-Type: application/json
//
//    {
//        "id":"1",
//        "name":"Tom",
//        "age":10
//    }
    @PostMapping
    fun save(@RequestBody cat:Cat):Cat{
        return catService.save(cat)
    }
}