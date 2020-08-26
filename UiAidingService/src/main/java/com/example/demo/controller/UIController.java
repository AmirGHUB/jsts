package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.ResponseModel.ResponseModel;
import com.example.demo.ResponseModel.UserResponse;

@RestController
public class UIController {
	

	@RequestMapping("getApplication/{userId}")
	
	private  List<ResponseModel>  getUserApps(@PathVariable("userId") int userId)
	{
		
		//Get User from User Info MicroService
		final String userURL = "http://localhost:8100/users/" + userId;
		RestTemplate restTemplate = new RestTemplate();
		
		UserResponse user = restTemplate.getForObject(userURL, UserResponse.class);
		
		
		//Get User Application From Application Microservice
	    final String applicationURL = "http://localhost:8085/getApplication/" + user.getId();
	     
	    
	    ResponseEntity<ResponseModel[]> response = restTemplate.getForEntity(applicationURL,ResponseModel[].class);
	    
	    ResponseModel[] apps = response.getBody();
	    
	    List<ResponseModel> results = new ArrayList<>();
	    for(ResponseModel rm : apps) {
	    	ResponseModel obj = new ResponseModel(user.getId(),rm.getApplicationId(),rm.getCompany(),rm.getPosition(),rm.getDateApplied(),rm.getContactName());
	    	results.add(obj);
	    }
	    
	    return results;
	   

	}

}
