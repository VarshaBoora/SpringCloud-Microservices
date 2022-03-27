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

    @GetMapping("/courseID/{id}")
    public Course getCourseInfo(@PathVariable(name = "id") int id){
        return service.getCourseInfo(id);
    }

    @PostMapping("/addCourse")
    public ResponseEntity<?> addCourse(@RequestBody Course course){
        try{
            return new ResponseEntity<Course>(service.saveCourseInfo(course), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @PostMapping("/updateCourse")
    public ResponseEntity<?> updateCourse(@RequestBody Course course){
        try {
            return new ResponseEntity<Course>(service.updateCourseInfo(course), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/dropCourse")
    public String dropCourse(@RequestBody Course course){
        try {
            service.dropCourse(course);
            return "course dropped!";
        }catch (Exception e){
            return e.getMessage();
        }
    }

}
