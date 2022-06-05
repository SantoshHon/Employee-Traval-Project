package com.mindgate.main.travlingRequestDetails.repository;

import java.util.List;

import com.mindgate.main.travelDocumentDetails.pojo.TravelDocumentDetails;
import com.mindgate.main.travlingRequestDetails.pojo.TravellingRequestDetails;

public interface TravlingRequestDetailsRepositoryInterface {
	public boolean addTravellingRequestDetails(TravellingRequestDetails travellingRequestDetails);
	public boolean updateTravellingRequestDetailsBytravelRequestId(TravellingRequestDetails travellingRequestDetails);
	public boolean deleteTravellingRequestDetailsBytravelRequestId(int travelRequestId);
	public TravellingRequestDetails getTravellingRequestDetailsBytravelRequestId(int travelRequestId);
	public List<TravellingRequestDetails> getAllTravellingRequestDetails();

}
