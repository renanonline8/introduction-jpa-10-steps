package com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "Learn AWS JPA!", "in20minutes"));
		repository.insert(new Course(2, "Learn Azure JPA!", "in20minutes"));
		repository.insert(new Course(3, "Learn DevOps JPA!", "in20minutes"));
		
		repository.delete(3);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
	}
	
}
