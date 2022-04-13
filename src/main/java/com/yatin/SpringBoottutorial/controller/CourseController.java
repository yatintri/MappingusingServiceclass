package com.yatin.SpringBoottutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yatin.SpringBoottutorial.entity.Course;
//import com.yatin.SpringBoottutorial.entity.CourseMaterial;
//import com.yatin.SpringBoottutorial.repository.CourseMaterialRepository;
import com.yatin.SpringBoottutorial.service.CourseService;

//this is controller course
@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/courses")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
	@GetMapping("/courses")
	public List<Course> fetchCourseList(){
		System.out.println("Hello yatin");
		return courseService.fetchCourseList();
	}
	
	@GetMapping("/courses/{id}")
	public Course fetchCourseById (@PathVariable("id")Long courseId) {
		return courseService.fetchCourseById(courseId);
	}
	
}





