package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	private CourseJdbcRepository repository;
	 
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(0, "Human Nature", "Vxloyd"));
		repository.insert(new Course(1, "The untold art", "Vxloyd"));
		repository.insert(new Course(2, "Insights on the fourth dimension", "vxloyd"));
		repository.insert(new Course(4, "never mind as...", "This will be deleted"));
		
		repository.deleteById((long) 4);
		
		System.out.println(repository.findById((long) 0));
		System.out.println(repository.findById((long) 1));
		System.out.println(repository.findById((long) 2));
	}

}
