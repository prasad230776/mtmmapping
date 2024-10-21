package com.example.mtmmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mtmmapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
