package com.admin.service.repository;

import com.admin.service.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GradeRepository extends JpaRepository<Grade, Integer> {
}
