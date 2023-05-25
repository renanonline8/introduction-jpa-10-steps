package com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.springJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.Course;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {
	
	public List<Course> findByAuthor(String author);
	
	public List<Course> findByName(String name);
}
