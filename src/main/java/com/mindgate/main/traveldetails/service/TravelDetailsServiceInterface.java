package com.mindgate.main.traveldetails.service;

import java.util.List;

import com.mindgate.main.traveldetails.pojo.TravelDetails;



public interface TravelDetailsServiceInterface {
	public boolean addTravelDetails(TravelDetails travelDetails);
	public boolean updateTravelDetailsByTravelDetailsId(TravelDetails travelDetails);
	public boolean deleteTravelDetailsByTravelDetailsId(int travelDetailsId);
	public TravelDetails getTravelDetailsByTravelDetailsId(int travelDetailsId);
	public List<TravelDetails> getAllTravelDetails();
	

}
