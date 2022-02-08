package com.yatin.SpringBoottutorial.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yatin.SpringBoottutorial.entity.Course;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, Long>{

}
