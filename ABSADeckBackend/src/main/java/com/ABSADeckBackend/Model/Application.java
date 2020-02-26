package com.ABSADeckBackend.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application")
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int applicationId;
	
	@Column(length = 10)
	private String applicationName;
	
	private String applicationDescription;
	
	private LocalDateTime lastUpdatedDate;
	
	private int lastUpdatedUser;
	
	private boolean isValid;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationDescription() {
		return applicationDescription;
	}

	public void setApplicationDescription(String applicationDescription) {
		this.applicationDescription = applicationDescription;
	}

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public int getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(int lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public Application() {
		super();
	}

	public Application(int applicationId, String applicationName, String applicationDescription,
			LocalDateTime lastUpdatedDate, int lastUpdatedUser, boolean isValid) {
		super();
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.applicationDescription = applicationDescription;
		this.lastUpdatedDate = lastUpdatedDate;
		this.lastUpdatedUser = lastUpdatedUser;
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationName=" + applicationName
				+ ", applicationDescription=" + applicationDescription + ", lastUpdatedDate=" + lastUpdatedDate
				+ ", lastUpdatedUser=" + lastUpdatedUser + ", isValid=" + isValid + "]";
	}

	
}
