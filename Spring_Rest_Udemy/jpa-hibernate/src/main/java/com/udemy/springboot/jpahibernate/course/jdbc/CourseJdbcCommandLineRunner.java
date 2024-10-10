package com.udemy.springboot.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemy.springboot.jpahibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		repo.insert(new Course(1, "Learn AWS1", "Walker"));
		repo.insert(new Course(2, "Learn AWS2", "Walker"));
		repo.insert(new Course(3, "Learn AWS3", "Walker"));
		
	}

}
