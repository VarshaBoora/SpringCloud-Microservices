package com.student.studentcatalogservice.models;


public class CatalogItem {

    private String courseID;
    private String courseName;
    private String grade;

    public CatalogItem(){}

    public CatalogItem(String courseID, String courseName, String grade) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.grade = grade;
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
