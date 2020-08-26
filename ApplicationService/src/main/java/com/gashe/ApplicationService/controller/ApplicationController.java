package com.gashe.ApplicationService.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gashe.ApplicationService.model.JobApplicationModel;
import com.gashe.ApplicationService.service.ApplicationService;


@RestController
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@GetMapping("/applications")
	List<JobApplicationModel> getApplications( ) {
		return applicationService.getApplications();
	}
	
	@PostMapping("/applications")
	JobApplicationModel addApplication(@RequestBody JobApplicationModel application) {
		return applicationService.addApplication(application);
	}
	
	@PutMapping("/applications/{applicationId}")
	public JobApplicationModel updateApplication(@RequestBody JobApplicationModel application, @PathVariable int applicationId) {
		Optional<JobApplicationModel> u = applicationService.getAnApplication(applicationId);
		if (u == null) return null;
		application.setApplicationId(applicationId);
		return applicationService.updateApplication(application);
	}
	
	
	@DeleteMapping("/applications/{applicationId}")
	public void deleteApplication( @PathVariable int applicationId){
		applicationService.deleteApplication(applicationId);
	}
	
	
	@GetMapping("/applications/{applicationId}")
	public Optional<JobApplicationModel> getAnApplication( @PathVariable int applicationId) {
		return applicationService.getAnApplication(applicationId);
	}
	
	@RequestMapping("/getApplication/{userId}")
	public List<JobApplicationModel> getUserApplications(@PathVariable("userId") int userId){
		return applicationService.getUserApllications(userId);
	}

}
