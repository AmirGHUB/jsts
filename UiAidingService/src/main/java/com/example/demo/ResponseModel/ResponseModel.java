package com.example.demo.ResponseModel;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResponseModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userID;
	private int applicationId;
	private String company;
	private String position;
	private String dateApplied;
	private String contactName;
	private String Status;
	
	
	public ResponseModel(long userID, int applicationId, String company,String position, String dateApplied,
			String contactName) {
		
		this.userID = userID;
		this.applicationId = applicationId;
		this.company = company;
		this.position = position;
		this.dateApplied = dateApplied;
		this.contactName = contactName;
		Status = "pending";
		
	}
	
	public ResponseModel() {
		
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public long getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
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

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	

}
