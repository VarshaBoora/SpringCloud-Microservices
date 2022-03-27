package com.admin.service.model;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer index;

    @Column
    private String courseID;
    @Column
    private String studentID;
    @Column
    private String grade;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Grade() {
    }

    public Grade(String courseID, String studentID, String grade) {
        this.courseID = courseID;
        this.studentID = studentID;
        this.grade = grade;
    }

    public Grade(int index, String courseID, String studentID, String grade) {
        this.index = index;
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
