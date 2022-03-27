package com.student.gradedataservice.resource;

import com.student.gradedataservice.model.Grade;
import com.student.gradedataservice.model.StudentGrade;
import com.student.gradedataservice.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grade")
public class GradesResource {

    @Autowired
    public GradeService service;

    @GetMapping("/sid/{studentID}")
    public StudentGrade getGrades(@PathVariable(name = "studentID") String studentID){
       return service.getGradeList(studentID);
    }

    @PostMapping("/addGrade")
    public Grade addGrade(@RequestBody Grade grade){
        return service.saveGradeInfo(grade);
    }

}
