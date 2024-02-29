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
				new Course(0, "Human Nature", "Vxloyd"),
				new Course(1, "The Untold Art", "Vxloyd"),
				new Course(2, "Unlearn what's Useless", "Vxloyd")
				);
	}
}
