package com.yatin.SpringBoottutorial.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yatin.SpringBoottutorial.entity.CourseMaterial;

//this is repo
@Repository
@Transactional
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {

}
