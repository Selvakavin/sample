package com.springboot.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springboot.project.main.StudentDates;


@EnableJpaRepositories
public interface studentdaterepo extends JpaRepository<StudentDates, Integer>{
	
}