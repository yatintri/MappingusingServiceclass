package com.yatin.SpringBoottutorial.service;

import java.util.List;

import com.yatin.SpringBoottutorial.entity.CourseMaterial;

public interface CourseMaterialService {

	public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial);

	public List<CourseMaterial> fetchCourseMaterial();

	public CourseMaterial fetchCourseMaterialById(Long courseMaterialId);

}
