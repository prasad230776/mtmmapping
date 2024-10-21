package com.example.mtmmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mtmmapping.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{
    
}
