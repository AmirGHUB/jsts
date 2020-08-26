package com.gashe.ApplicationService.DataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.gashe.ApplicationService.model.JobApplicationModel;


@Repository
public interface ApplicationDAO extends JpaRepository<JobApplicationModel , Integer>{
	

	
}
