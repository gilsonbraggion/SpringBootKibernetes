package com.gilsonbraggion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gilsonbraggion.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
