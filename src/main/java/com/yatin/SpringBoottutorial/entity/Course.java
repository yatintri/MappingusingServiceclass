package com.yatin.SpringBoottutorial.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

//import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
	
	@Id
	@SequenceGenerator(
			name = "course_sequence",
			sequenceName = "course_sequence",
			allocationSize = 1
			)

	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	private String title;
	private Integer credit;
	
	 @OneToOne(
	            mappedBy = "course",
	            cascade = CascadeType.ALL
	    )
	 private CourseMaterial courseMaterial;
	 
	
}









