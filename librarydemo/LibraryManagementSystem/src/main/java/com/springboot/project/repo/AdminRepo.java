package com.springboot.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springboot.project.main.Admindatas;


@EnableJpaRepositories
public interface AdminRepo extends JpaRepository<Admindatas, Integer>{
	
}
