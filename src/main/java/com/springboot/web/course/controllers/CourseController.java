package com.springboot.web.course.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.course.entities.Course;
import com.springboot.web.course.services.CourseService;


@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
         
	//GetRequest
	@GetMapping("/courses/coursedeveloper")
	public List<Course> getCourses() {
	
		return this.courseService.getAllcourses();
	}
	

    //PostRequest
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
           Course c = this.courseService.addCourse(course);
		return c;
	}
	
	//PutRequest(Update)
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@RequestBody Course course ,@PathVariable("courseId") int courseId) {
	
		
		this.courseService.updateCourse(course,courseId);
		return course;
	}
	
	

}
