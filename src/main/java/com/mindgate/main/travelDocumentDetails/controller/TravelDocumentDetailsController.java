package com.mindgate.main.travelDocumentDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.travelDocumentDetails.pojo.TravelDocumentDetails;
import com.mindgate.main.travelDocumentDetails.service.TravelDocumentDetailsServiceInterface;
import com.mindgate.main.traveldetails.pojo.TravelDetails;

@RestController
@RequestMapping("documentdetails")
public class TravelDocumentDetailsController {
	@Autowired
	private TravelDocumentDetailsServiceInterface travelDocumentDetails;
	@RequestMapping(value = "documentdetail", method = RequestMethod.POST)
	public boolean addTravelDocumentDetails(@RequestBody TravelDocumentDetails TravelDocumentDetails)
	{
		return travelDocumentDetails.addTravelDocumentDetails(TravelDocumentDetails);
		
	}
	}


