package com.admin.service.service;

import com.admin.service.exception.AdminException;
import com.admin.service.model.Course;
import com.admin.service.model.Grade;
import com.admin.service.repository.CourseRepository;
import com.admin.service.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminService {

    CourseRepository crepo;

    GradeRepository grepo;

    public Course saveCourseInfo(Course course) throws AdminException {
        if(crepo.getByCourseID(course.getCourseID())!=null){
            throw new AdminException("Course cannot be stored! Since already Exists!");
        }else
            return crepo.save(course);
    }

    public Grade saveGradeInfo(Grade grade) throws AdminException {
            return grepo.save(grade);
    }
}
