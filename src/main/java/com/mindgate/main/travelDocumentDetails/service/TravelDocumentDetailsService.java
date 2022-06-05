package com.mindgate.main.travelDocumentDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.travelDocumentDetails.pojo.TravelDocumentDetails;
import com.mindgate.main.travelDocumentDetails.repository.TravelDocumentDetailsRepsitoryInterface;
import com.mindgate.main.traveldetails.repository.TravelDetailsRepositoryInterface;
@Service
public class TravelDocumentDetailsService implements TravelDocumentDetailsServiceInterface {
    @Autowired
    private  TravelDocumentDetailsRepsitoryInterface TravelDocumentDetailsRepsitoryInterface;
	@Override
	public boolean addTravelDocumentDetails(TravelDocumentDetails documentDetails) {
		return  TravelDocumentDetailsRepsitoryInterface.addTravelDocumentDetails(documentDetails);
	}

	@Override
	public boolean updateTravelDocumentDetailsBydocumentId(TravelDocumentDetails documentDetails) {
		return TravelDocumentDetailsRepsitoryInterface.updateTravelDocumentDetailsBydocumentId(documentDetails);
	}

	@Override
	public boolean deleteTravelDocumentDetailsBydocumentId(int documentId) {
		return TravelDocumentDetailsRepsitoryInterface.deleteTravelDocumentDetailsBydocumentId(documentId);
	}

	@Override
	public TravelDocumentDetails getTravelDocumentDetailsByTravelDetailsId(int documentId) {
		return TravelDocumentDetailsRepsitoryInterface.getTravelDocumentDetailsByTravelDetailsId(documentId);
	}

	@Override
	public List<TravelDocumentDetails> getAllTravelDocumentDetails() {
		return TravelDocumentDetailsRepsitoryInterface.getAllTravelDocumentDetails();
	}
	
	

}
