package com.student.courseinfoservice.service;

import com.student.courseinfoservice.exception.CourseException;
import com.student.courseinfoservice.model.Course;
import com.student.courseinfoservice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository repo;

    public Course getCourseInfo(int id){
        Course dbObj = repo.findById(id).get();
        return dbObj;
    }

    public Course saveCourseInfo(Course course) throws CourseException{
        return repo.save(course);
    }

    public Course updateCourseInfo(Course course){
        Optional<Course> dbObj = repo.findById(course.getId());
        dbObj.get().setCourseID(course.getCourseID());
        dbObj.get().setCourseName(course.getCourseName());
        return repo.save(dbObj.get());
    }

    public void dropCourse(Course course){
        repo.delete(course);
    }
}
