package com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.springJpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renansgomes.learnspringboot.learnspringbootjdbcjpa.course.Course;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {

}
