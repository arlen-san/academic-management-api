package com.portfolio.academic_api.repository;

import com.portfolio.academic_api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}