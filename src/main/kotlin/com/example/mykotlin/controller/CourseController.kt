package com.example.mykotlin.controller

import com.example.mykotlin.dto.CourseDTO
import com.example.mykotlin.service.CourseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/courses")
class CourseController(val courseService : CourseService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addCourse(@RequestBody courseDTO: CourseDTO): CourseDTO {
        return courseService.addCourse(courseDTO)
    }

    @GetMapping
    fun retrieveAllCourses() : List<CourseDTO> = courseService.retrieveAllCourses()

    //courseId
    @PutMapping("/{course_id}")
    fun updateCourse(@RequestBody courseDTO: CourseDTO
                     , @PathVariable("course_id") courseId : Int)
            = courseService.updateCourse(courseId, courseDTO)

    @DeleteMapping("/{course_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCourse(@PathVariable("course_id") courseId : Int)
            = courseService.deleteCourse(courseId)
}