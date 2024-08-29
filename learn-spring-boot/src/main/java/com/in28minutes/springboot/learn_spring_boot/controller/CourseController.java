package com.in28minutes.springboot.learn_spring_boot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springboot.learn_spring_boot.entity.Course;

@RestController
public class CourseController {
    @RequestMapping("courses")
    public List<Course>retrieveAllCourse(){
        return Arrays.asList(new Course(1,"Spring","Ranga"),
        new Course(2,"Java","Harry"),
        new Course(3,"Learn Azure","Ranga"));
    }
}
