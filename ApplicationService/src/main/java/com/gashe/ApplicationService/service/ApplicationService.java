package com.gashe.ApplicationService.service;

import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gashe.ApplicationService.DataAccess.ApplicationDAO;
import com.gashe.ApplicationService.model.JobApplicationModel;


@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationDAO applicationData;
	
	public List<JobApplicationModel> getApplications(){
		return applicationData.findAll();
	}
	
	public JobApplicationModel addApplication(JobApplicationModel application) {
		return applicationData.save(application);
		
	}
	
	public JobApplicationModel updateApplication(JobApplicationModel jb) {
		return applicationData.save(jb);
	}
	
	public void deleteApplication(int appId){
		Optional<JobApplicationModel> oldUser = getAnApplication(appId);
		if (oldUser == null) {
			return;
		}
		applicationData.deleteById(appId);
	}
	
	public Optional<JobApplicationModel> getAnApplication(int appId) {
		return applicationData.findById(appId);
	}
	
	public List<JobApplicationModel> getUserApllications(int userId){
		List<JobApplicationModel> filteredByUserId =   applicationData.findAll().stream()
				.filter(j -> j.getUserID()==userId).collect(Collectors.toList());
		return filteredByUserId;
	}

}
