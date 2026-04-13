package com.restapi.resrcs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.resrcs.DTO.student;

@RestController // This annotation indicates that this class is a REST controller, which means it will handle HTTP requests and return responses in a RESTful manner.
public class studentcontroller {
 @GetMapping("/student") // This annotation maps HTTP GET requests to the getStudents() method. When a GET request is made to the "/students" endpoint, this method will be invoked.
   public student getstudent() {
    return new student(1, "John Doe", "john.doe@example.com");
   }}
