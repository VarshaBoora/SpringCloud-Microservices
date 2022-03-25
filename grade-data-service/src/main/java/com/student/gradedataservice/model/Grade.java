package com.student.gradedataservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grade {

    @Id
    private int index;
    private String courseID;
    private String studentID;
    private String grade;

    public Grade() {
    }

    public Grade(String courseID, String studentID, String grade) {
        this.courseID = courseID;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
