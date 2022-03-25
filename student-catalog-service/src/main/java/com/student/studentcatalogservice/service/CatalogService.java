package com.student.studentcatalogservice.service;

import com.student.studentcatalogservice.models.CatalogItem;
import com.student.studentcatalogservice.models.Course;
import com.student.studentcatalogservice.models.StudentGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CatalogService {

    @Autowired
    private RestTemplate restTemplate;

    public List<CatalogItem> getCatalogItem(String studentID){
        StudentGrade grades = restTemplate.getForObject("http://grade-data-service/grade/sid/"+studentID, StudentGrade.class);

        return grades.getGradeList().stream().map(grade->{
                    Course course = restTemplate.getForObject("http://course-info-service/courses/"+grade.getCourseID(),Course.class);
                    return new CatalogItem(course.getCourseID(), course.getCourseName(), grade.getGrade());
                })
                .collect(Collectors.toList());
    }

}
