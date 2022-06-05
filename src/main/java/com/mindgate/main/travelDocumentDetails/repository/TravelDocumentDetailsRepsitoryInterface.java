package com.mindgate.main.travelDocumentDetails.repository;

import java.util.List;

import com.mindgate.main.travelDocumentDetails.pojo.TravelDocumentDetails;

public interface TravelDocumentDetailsRepsitoryInterface {
	public boolean addTravelDocumentDetails(TravelDocumentDetails documentDetails);
	public boolean updateTravelDocumentDetailsBydocumentId(TravelDocumentDetails documentDetails);
	public boolean deleteTravelDocumentDetailsBydocumentId(int documentId);
	public TravelDocumentDetails getTravelDocumentDetailsByTravelDetailsId(int documentId);
	public List<TravelDocumentDetails> getAllTravelDocumentDetails();

}
