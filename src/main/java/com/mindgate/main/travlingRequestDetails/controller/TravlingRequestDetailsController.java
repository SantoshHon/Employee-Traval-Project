package com.mindgate.main.travlingRequestDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.travlingRequestDetails.pojo.TravellingRequestDetails;
import com.mindgate.main.travlingRequestDetails.service.TravlingRequestDetailsServiceInterface;

@RestController
@RequestMapping("travlingrequests")
public class TravlingRequestDetailsController {
	@Autowired
	private TravlingRequestDetailsServiceInterface detailsServiceInterface;
	@RequestMapping(value = "travlingrequest", method = RequestMethod.POST)
	public boolean addTravellingRequestDetails(@RequestBody TravellingRequestDetails travellingRequestDetails)
	{
		return detailsServiceInterface.addTravellingRequestDetails(travellingRequestDetails);
	}
}
