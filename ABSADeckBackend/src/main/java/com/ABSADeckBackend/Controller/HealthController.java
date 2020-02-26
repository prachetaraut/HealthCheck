package com.ABSADeckBackend.Controller;

import java.util.List;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ABSADeckBackend.Model.Health;
import com.ABSADeckBackend.Service.HealthService;

@RestController
@RequestMapping("/health")
@CrossOrigin
public class HealthController {
	
	@Autowired
	public HealthService healthService;
	
	@GetMapping("/find/{applicationId}/{screenId}")
    public List<Health> findByAppIdScreenId(@PathVariable int applicationId, @PathVariable int screenId) {
		System.out.println("Controller find/appId/screenId: "+healthService.findHealthByAppIdScreenId(applicationId, screenId));
		return healthService.findHealthByAppIdScreenId(applicationId, screenId);
	}
	
	@GetMapping("/findAll")
    public List<Health> findAll() {
		return healthService.findAll();
	}
	
	@GetMapping("/{healthId}")
    public Health findById(@PathVariable int healthId) {
		return healthService.findByHealthId(healthId);
	}
	
	@PostMapping("/save")
	public @ResponseBody Health save(@RequestBody Health health, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
            throw new ValidationException();
        }
		
		else
		{
			healthService.save(health);
		}
		
		return health;
	}
	
	

}
