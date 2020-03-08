package com.mom.tool;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mom.tool.bean.LimitConfiguration;

@RestController  
public class LimitsConfigurationController {

	@Autowired    
	private Configuration configuration;  
	
	@GetMapping("/limits")  
	public List<LimitConfiguration> retriveLimitsFromConfigurations()  
	{  
		
	List<LimitConfiguration> configuration = new ArrayList<LimitConfiguration>();
	configuration.add(new LimitConfiguration(1000, 1));
	configuration.add(new LimitConfiguration(1, 1000));
	return configuration;
	} 
	
	@GetMapping("/limits-with-properties")  
	public LimitConfiguration retriveLimitsFromProperty()  
	{  
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum()); 
	}  
}
