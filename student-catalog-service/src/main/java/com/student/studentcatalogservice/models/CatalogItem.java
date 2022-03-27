package com.student.studentcatalogservice.models;


public class CatalogItem {

    private String courseID;
    private String courseName;
    private String grade;
    private String studentID;

    public CatalogItem(){
    }

    public CatalogItem(String courseID, String courseName, String grade, String studentID) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.grade = grade;
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
