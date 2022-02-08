package com.yatin.SpringBoottutorial.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterial {
	
		@Id
	    @SequenceGenerator(
	            name = "course_material_sequence",
	            sequenceName = "course_material_sequence",
	            allocationSize = 1
	    )

		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long courseMaterialId;
		private String url;
		@OneToOne(
				cascade = CascadeType.ALL
				)
		@JoinColumn(
				name = "course_Id",
				referencedColumnName = "courseId"
				)
		private Course course;
		
	
}










