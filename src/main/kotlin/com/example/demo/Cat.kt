package com.example.demo

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity(name = "cat")
class Cat(@Id var  id: String, var name: String, var age: Int ) {
}