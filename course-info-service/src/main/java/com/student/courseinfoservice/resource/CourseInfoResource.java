package com.student.courseinfoservice.resource;

import com.student.courseinfoservice.model.Course;
import com.student.courseinfoservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseInfoResource {

    @Autowired
    public CourseService service;

    @PostMapping("/courseID")
    public Course getCourseInfo(@RequestBody Course course){
        return service.getCourseInfo(course);
    }

    @PostMapping("/addCourse")
    public ResponseEntity<?> addCourse(@RequestBody Course course){
        try{
            return new ResponseEntity<Course>(service.saveCourseInfo(course), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

}
