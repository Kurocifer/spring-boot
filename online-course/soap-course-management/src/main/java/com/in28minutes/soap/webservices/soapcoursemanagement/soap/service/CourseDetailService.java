package com.in28minutes.soap.webservices.soapcoursemanagement.soap.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.in28minutes.soap.webservices.soapcoursemanagement.soap.bean.Course;

@Component  
public class CourseDetailService {
	
	private static List<Course> courses = new ArrayList<>();
	
	static {
		Course course0 = new Course(0, "Spring", "10 Steps");
		courses.add(course0);
		
		Course course1 = new Course(1, "java", "java like a G");
		courses.add(course1);
		
		Course course2 = new Course(2, "Linux", "Know how linux works");
		courses.add(course2);
		
		Course course3 = new Course(3, "security", "know how to protect it before breaking it");
		courses.add(course3);
	}
	
	public Course findById(int id) {
		for(Course course : courses) {
			if(course.getId() == id)
				return course;
		}
		
		return null;
	}
	
	public List<Course> findAll() {
		return courses;
	}
	
	
	public int deleteByIdById(int id) {
		
		Iterator<Course> iterator = courses.iterator();
		
		while(iterator.hasNext()) {
			Course course = iterator.next();
			
			if(course.getId() == id) {
				iterator.remove();
				return 1;
			}
		}
		
		return 0;
	}
	
}
