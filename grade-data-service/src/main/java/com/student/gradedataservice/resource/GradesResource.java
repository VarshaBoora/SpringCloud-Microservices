package com.student.gradedataservice.resource;

import com.student.gradedataservice.model.StudentGrade;
import com.student.gradedataservice.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grade")
public class GradesResource {

    @Autowired
    public GradeService service;

    @GetMapping("/sid")
    public StudentGrade getGrades(@RequestBody String studentID){
       return service.getGradeList(studentID);
    }

}
