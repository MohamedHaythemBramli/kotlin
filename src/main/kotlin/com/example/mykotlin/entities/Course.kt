package com.example.mykotlin.entities

import jakarta.persistence.*

@Entity
@Table(name = "Courses")
data class Course(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Int?,
        var name : String,
        var category : String
)