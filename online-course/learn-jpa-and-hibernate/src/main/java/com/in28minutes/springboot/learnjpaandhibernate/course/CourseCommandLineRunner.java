package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDatajpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	//@Autowired
	//private CourseJdbcRepository repository;
	
	//@Autowired
	//private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDatajpaRepository repository;
	 
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(0, "Human Nature", "Vxloyd"));
		repository.save(new Course(1, "The untold art", "Vxloyd"));
		repository.save(new Course(2, "Insights on the fourth dimension", "vxloyd"));
		repository.save(new Course(4, "never mind as...", "This will be deleted"));
		
		repository.deleteById(4l);
		
		System.out.println(repository.findById(0l));
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Vxloyd"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Human Nature"));
	}

}
