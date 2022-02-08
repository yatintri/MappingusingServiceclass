package com.yatin.SpringBoottutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yatin.SpringBoottutorial.entity.Course;
import com.yatin.SpringBoottutorial.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course saveCourse(Course course) {
		
		return courseRepository.save(course);
	}

	@Override
	public List<Course> fetchCourseList() {
		
		return courseRepository.findAll();
	}

	@Override
	public Course fetchCourseById(Long courseId) {
			return courseRepository.getById(courseId);
	}
	
	

}
















