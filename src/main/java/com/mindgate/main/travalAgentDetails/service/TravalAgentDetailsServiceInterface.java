package com.mindgate.main.travalAgentDetails.service;

import java.util.List;

import com.mindgate.main.travalAgentDetails.pojo.TravalAgentDetails;

public interface TravalAgentDetailsServiceInterface {
	
	public boolean addTravalAgentDetails(TravalAgentDetails travalAgentDetails);
	public boolean updateTravalAgentDetailsByAgentId(TravalAgentDetails travalAgentDetails);
	public boolean deleteTravalAgentDetailsByAgentId(int agentId);
	public TravalAgentDetails getTravalAgentDetailsByAgentId(int agentId);
	public List<TravalAgentDetails>getAllTravalAgentDetails();

}
