package com.admin.service.resource;

import com.admin.service.model.Course;
import com.admin.service.model.Grade;
import com.admin.service.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminResource {

    @Autowired
    public AdminService service;

    @PostMapping("/course")
    public ResponseEntity<?> saveCourseInfo(@RequestBody Course course){
        try{
            return new ResponseEntity<Course>(service.saveCourseInfo(course), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @PostMapping("/grade")
    public ResponseEntity<?> saveGradeInfo(@RequestBody Grade grade){
        try{
            return new ResponseEntity<Grade>(service.saveGradeInfo(grade), HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
