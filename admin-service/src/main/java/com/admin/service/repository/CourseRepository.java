package com.admin.service.repository;

import com.admin.service.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    Course getByCourseID(String courseID);
}
