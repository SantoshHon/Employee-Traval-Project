package com.mindgate.main.travalAgentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.travalAgentDetails.pojo.TravalAgentDetails;
import com.mindgate.main.travalAgentDetails.service.TravalAgentDetailsServiceInterface;

@RestController
@RequestMapping("agentdetails")
public class TravalAgentDetailsController {
	
	@Autowired
	private TravalAgentDetailsServiceInterface detailsServiceInterface;
	@RequestMapping(value = "agentdetail", method = RequestMethod.POST)
	public boolean addTravalAgentDetails( @RequestBody TravalAgentDetails travalAgentDetails)	{
		return detailsServiceInterface.addTravalAgentDetails(travalAgentDetails);
		
	}

}
