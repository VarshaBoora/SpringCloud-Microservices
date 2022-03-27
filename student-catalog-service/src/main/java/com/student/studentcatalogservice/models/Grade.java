package com.student.studentcatalogservice.models;

public class Grade {

    private int courseID;
    private String studentID;
    private String grade;

    public Grade(){}

    public Grade(int courseID, String studentID, String grade) {
        this.courseID = courseID;
        this.studentID = studentID;
        this.grade = grade;
    }

    public Grade(int courseID, String grade) {
        this.courseID = courseID;
        this.grade = grade;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
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
