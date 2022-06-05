package com.mindgate.main.traveldetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.slabmaster.pojo.SlabMaster;
import com.mindgate.main.slabmaster.service.SlabMasterServiceInterface;
import com.mindgate.main.traveldetails.pojo.TravelDetails;
import com.mindgate.main.traveldetails.service.TravelDetailsServiceInterface;

@RestController
@RequestMapping("travelDetals")
public class TraveldetailsController {
	@Autowired
	private TravelDetailsServiceInterface travelDetailsServiceInterface;
	@RequestMapping(value = "traveldetail", method = RequestMethod.POST)
	public boolean addTravelDetails(@RequestBody TravelDetails travelDetails) {
		return travelDetailsServiceInterface.addTravelDetails(travelDetails);
		
	}
	
}
	

