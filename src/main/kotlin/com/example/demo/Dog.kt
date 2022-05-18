package com.example.demo

import javax.persistence.Entity
import javax.persistence.Id


@Entity(name = "dog")
class Dog(@Id var id: Int, var name: String, var age: Int ) {
}