package com.example.mykotlin.repositories

import com.example.mykotlin.entities.Course
import org.springframework.data.repository.CrudRepository

interface CourseRepository : CrudRepository<Course, Int>
