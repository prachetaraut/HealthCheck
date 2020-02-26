package com.ABSADeckBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ABSADeckBackend.Model.Health;
import com.ABSADeckBackend.Repository.HealthRepository;

@Service
public class HealthService {
	
	@Autowired
	HealthRepository healthRepository;

	//Find health by applicationId and screenId
	public List<Health> findHealthByAppIdScreenId(int applicationId, int screenId){
		return healthRepository.findHealthByAppIdScreenId(applicationId, screenId);
	}
	
	//Find All
	public List<Health> findAll(){
		return healthRepository.findAll();
	}
	
	//Find by healthId
	public Health findByHealthId(int healthId) {
		return healthRepository.findByHealthId(healthId);
	}
	
	//Save record
	public void save(Health health) {
        healthRepository.save(health);
    }

}
