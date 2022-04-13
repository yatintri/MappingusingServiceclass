package com.yatin.SpringBoottutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yatin.SpringBoottutorial.entity.CourseMaterial;
import com.yatin.SpringBoottutorial.service.CourseMaterialService;

@RestController
public class CourseMaterialController {
	
	@Autowired
	private CourseMaterialService courseMaterialService;

	//this is post mapping
	@PostMapping("/courseMaterial")
	public CourseMaterial saveCourseMaterial(@RequestBody CourseMaterial courseMaterial) {
		return courseMaterialService.saveCourseMaterial(courseMaterial);
	}
	
	@GetMapping("/courseMaterial")
	public List<CourseMaterial> fetchCourseMaterial(){
		return courseMaterialService.fetchCourseMaterial();
	}
	
	@GetMapping("/courseMaterial/{id}")
	public CourseMaterial fetchCourseMaterialById (@PathVariable("id")Long courseMaterialId) {
		return courseMaterialService.fetchCourseMaterialById(courseMaterialId);
	}
}






