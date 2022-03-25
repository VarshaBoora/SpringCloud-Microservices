package com.student.courseinfoservice.service;

import com.student.courseinfoservice.exception.CourseException;
import com.student.courseinfoservice.model.Course;
import com.student.courseinfoservice.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired(required = false)
    CourseRepository repo;

    public Course getCourseInfo(Course course){
        return repo.getById(course.getId());
    }

    public Course saveCourseInfo(Course course) throws CourseException{
        if(repo.getById(course.getId())!=null){
            throw new CourseException("Course Info already Exists!");
        }else
            return repo.save(course);
    }
}
