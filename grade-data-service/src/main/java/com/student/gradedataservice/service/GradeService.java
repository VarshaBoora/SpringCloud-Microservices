package com.student.gradedataservice.service;

import com.student.gradedataservice.model.StudentGrade;
import com.student.gradedataservice.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {

    @Autowired(required = false)
    public GradeRepository repo;

    public StudentGrade getGradeList(String studentId){
        StudentGrade sgrade = null;
        sgrade.setGradeList(repo.getAllByStudentID(studentId));
        return sgrade;
    }

}
