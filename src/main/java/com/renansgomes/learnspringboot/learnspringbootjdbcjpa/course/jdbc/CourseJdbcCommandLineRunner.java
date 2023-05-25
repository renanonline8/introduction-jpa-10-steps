package com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS Now!", "in20minutes"));
		repository.insert(new Course(2, "Learn Azure Now!", "in20minutes"));
		repository.insert(new Course(3, "Learn DevOps Now!", "in20minutes"));
		
		repository.delete(3);
	}
	
}
