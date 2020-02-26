package com.ABSADeckBackend.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "screen")
public class Screen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int screenId;
	
	@Column(length = 20)
	private String screenName;
	
	private String screenDescription;
	
	private LocalDateTime lastUpdatedDate;
	
	private int lastUpdatedUser;
	
	private boolean isValid;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getScreenDescription() {
		return screenDescription;
	}

	public void setScreenDescription(String screenDescription) {
		this.screenDescription = screenDescription;
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

	public Screen() {
		super();
	}

	public Screen(int screenId, String screenName, String screenDescription, LocalDateTime lastUpdatedDate,
			int lastUpdatedUser, boolean isValid) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.screenDescription = screenDescription;
		this.lastUpdatedDate = lastUpdatedDate;
		this.lastUpdatedUser = lastUpdatedUser;
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + ", screenDescription="
				+ screenDescription + ", lastUpdatedDate=" + lastUpdatedDate + ", lastUpdatedUser=" + lastUpdatedUser
				+ ", isValid=" + isValid + "]";
	}
	
}
