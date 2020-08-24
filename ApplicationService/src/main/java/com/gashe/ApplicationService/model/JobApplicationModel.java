package com.gashe.ApplicationService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JobApplicationModel {
	
	@Id
	@GeneratedValue
	private int applicationId;
	private int userID;
	private String company;
	private String position;
	private String dateApplied;
	private String contactName;
	
	
	public JobApplicationModel(int userID, int applicationId, String company,String position, String dateApplied,
			String contactName) {
		
		this.userID = userID;
		this.applicationId = applicationId;
		this.company = company;
		this.position = position;
		this.dateApplied = dateApplied;
		this.contactName = contactName;
		
	}
	
	public JobApplicationModel() {
		super();
	}


	public int getUserID() {
		return userID;
	}


	public void setUserID(int userID) {
		this.userID = userID;
	}


	public int getApplicationId() {
		return applicationId;
	}


	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public String getDateApplied() {
		return dateApplied;
	}


	public void setDateApplied(String dateApplied) {
		this.dateApplied = dateApplied;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	
}
