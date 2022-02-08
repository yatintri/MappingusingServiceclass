package com.yatin.SpringBoottutorial.service;

import java.util.List;

import com.yatin.SpringBoottutorial.entity.Course;


public interface CourseService {

    public Course saveCourse(Course course);

	public List<Course> fetchCourseList();

	public Course fetchCourseById(Long courseId);
	

	 

}
