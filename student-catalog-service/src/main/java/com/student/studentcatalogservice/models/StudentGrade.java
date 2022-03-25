package com.student.studentcatalogservice.models;

import java.util.List;

public class StudentGrade {

    private List<Grade> gradeList;

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public StudentGrade(){}
}
