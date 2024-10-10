package com.udemy.springboot.jpahibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.udemy.springboot.jpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findByID(long id) {
		return entityManager.find(Course.class, id);
	}
	
}
