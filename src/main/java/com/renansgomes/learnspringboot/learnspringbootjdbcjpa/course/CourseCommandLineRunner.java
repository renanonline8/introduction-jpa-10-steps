package com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.jpa.CourseJpaRepository;
import com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.springJpa.CourseSpringJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseSpringJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS JPA!", "in20minutes"));
		repository.save(new Course(2, "Learn Azure JPA!", "in20minutes"));
		repository.save(new Course(3, "Learn DevOps JPA!", "in20minutes"));
		
		repository.deleteById(3l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());
		System.out.println("Qtd Courses: " + repository.count());
		
		System.out.println(repository.findByAuthor("in20minutes"));
		System.out.println(repository.findByName("Learn Azure JPA!"));
	}
	
}
