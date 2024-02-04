package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "ciferBlack"),
				new Course(2, "Learn CyberSecurity", "ciferBlack"),
				new Course(3, "Learn System Security", "ciferBlack"),
				new Course(4, "Learn Human Psychology", "ciferBlack")
				);
	}
}