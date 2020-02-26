package com.ABSADeckBackend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ABSADeckBackend.Model.Health;

public interface HealthRepository extends JpaRepository<Health, Integer> {
	
	@Query(value = "SELECT * FROM health h WHERE application_id = '?1' and screen_id = '?2' and h.is_valid = '1'",
            nativeQuery=true)
	List<Health> findHealthByAppIdScreenId(int applicationId, int screenId);
	
	@Query(value = "SELECT * from health where health_id = '?1'",
            nativeQuery=true)
	Health findByHealthId(int healthId);

}
