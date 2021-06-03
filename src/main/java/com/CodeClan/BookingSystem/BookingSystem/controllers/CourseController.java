package com.CodeClan.BookingSystem.BookingSystem.controllers;

import com.CodeClan.BookingSystem.BookingSystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity getAllCourses(
            @RequestParam(name = "id", required = false) Long id,
            @RequestParam(name = "location", required = false) String location,
            @RequestParam(name = "rating", required = false) Integer rating
    ){
        if (id != null){
            return new ResponseEntity(courseRepository.getByBookingsCustomerId(id), HttpStatus.OK);
        }
        return new ResponseEntity(courseRepository.findAll(),HttpStatus.OK);
    }
}
