package com.student.courseinfoservice.model;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {

    @Id
    private Integer id;
    private String courseID;
    private String courseName;

    public Course() {
    }

    public Course(Integer id, String courseID, String courseName) {
        this.id = id;
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Course(String courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
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
}
