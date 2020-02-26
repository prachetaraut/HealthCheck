package com.ABSADeckBackend.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "health")
public class Health {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int healthId;
	
	private int applicationId;
	
	private int screenId;
	
	private int parameterId;
	
	private int countryId;
	
	@Column(length = 1)
	private String healthStatus;
	
	@Column(length = 10)
	private String healthComment;
	
	private LocalDateTime startTime;
	
	private LocalDateTime endTime;
	
	private LocalDateTime lastUpdatedDate;
	
	private int lastUpdatedUser;
	
	private boolean isValid;

	public int getHealthId() {
		return healthId;
	}

	public void setHealthId(int healthId) {
		this.healthId = healthId;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getParameterId() {
		return parameterId;
	}

	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	public String getHealthComment() {
		return healthComment;
	}

	public void setHealthComment(String healthComment) {
		this.healthComment = healthComment;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
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

	public Health() {
		super();
	}

	public Health(int healthId, int applicationId, int screenId, int parameterId, int countryId, String healthStatus,
			String healthComment, LocalDateTime startTime, LocalDateTime endTime, LocalDateTime lastUpdatedDate,
			int lastUpdatedUser, boolean isValid) {
		super();
		this.healthId = healthId;
		this.applicationId = applicationId;
		this.screenId = screenId;
		this.parameterId = parameterId;
		this.countryId = countryId;
		this.healthStatus = healthStatus;
		this.healthComment = healthComment;
		this.startTime = startTime;
		this.endTime = endTime;
		this.lastUpdatedDate = lastUpdatedDate;
		this.lastUpdatedUser = lastUpdatedUser;
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "Health [healthId=" + healthId + ", applicationId=" + applicationId + ", screenId=" + screenId
				+ ", parameterId=" + parameterId + ", countryId=" + countryId + ", healthStatus=" + healthStatus
				+ ", healthComment=" + healthComment + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", lastUpdatedDate=" + lastUpdatedDate + ", lastUpdatedUser=" + lastUpdatedUser + ", isValid="
				+ isValid + "]";
	}
	
}
