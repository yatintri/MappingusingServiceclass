package com.yatin.SpringBoottutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yatin.SpringBoottutorial.entity.CourseMaterial;
import com.yatin.SpringBoottutorial.repository.CourseMaterialRepository;

@Service
public class CourseMaterialServiceImpl implements CourseMaterialService {

	@Autowired
	private CourseMaterialRepository courseMaterialRepository;
	
	@Override
	public CourseMaterial saveCourseMaterial(CourseMaterial courseMaterial) {
		return courseMaterialRepository.save(courseMaterial);
	}

	@Override
	public List<CourseMaterial> fetchCourseMaterial() {
		
		return courseMaterialRepository.findAll();
	}

	@Override
	public CourseMaterial fetchCourseMaterialById(Long courseMaterialId) {
		return courseMaterialRepository.getById(courseMaterialId);
	}

}




