package com.student.gradedataservice.repository;

import com.student.gradedataservice.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, String> {

    List<Grade> getAllByStudentID(String studentID);

}
