package com.mindgate.main.travlingRequestDetails.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.travelDocumentDetails.pojo.TravelDocumentDetails;
import com.mindgate.main.travelDocumentDetails.repository.TravelDocumentDetailsRowMapper;
import com.mindgate.main.travlingRequestDetails.pojo.TravellingRequestDetails;

@Repository
public class TravlingRequestDetailsRepository implements TravlingRequestDetailsRepositoryInterface{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private int resultCount;
	
	private static final String INSERT_TravellingRequestDetails = " INSERT INTO travelling_request_details(TRAVEL_DEPARTURE_DATE,TRAVEL_RETURN_DATE,TRAVEL_REASON ,TRAVEL_MODE ,TRAVEL_STATUS ,PROJECT_MANAGER_STATUS ,DIRECTOR_STATUS ,EMPLOYEE_ID,TRAVEL_LOCATION ,TRAVEL_DETAILS_ID , DOCUMENT_ID )VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_ALL_TravellingRequestDetails = "SELECT * FROM travelling_request_details";
	private static final String SELECT_SINGLE_TravellingRequestDetailsBytravelRequestId= "SELECT * FROM travelling_request_details WHERE TRAVEL_REQUEST_ID= ?";
	private static final String UPDATE_travelTravellingRequestDetailsBytravelRequestId = "UPDATE travelling_request_details SET TRAVEL_DEPARTURE_DATE=?,TRAVEL_RETURN_DATE=?,TRAVEL_REASON=? ,TRAVEL_MODE=? ,TRAVEL_STATUS=? ,PROJECT_MANAGER_STATUS=? ,DIRECTOR_STATUS=? ,EMPLOYEE_ID=?,TRAVEL_LOCATION=? ,TRAVEL_DETAILS_ID=? , DOCUMENT_ID=?  WHERE TRAVEL_REQUEST_ID = ?";
	private static final String DELETE_TravellingRequestDetailsBytravelRequestId= "DELETE travelling_request_details WHERE TRAVEL_REQUEST_ID= ? ";

	@Override
	public boolean addTravellingRequestDetails(TravellingRequestDetails travellingRequestDetails) {
		Object[] args= {travellingRequestDetails.getTravelDepartureDate(),travellingRequestDetails.getTravelReturndate(),travellingRequestDetails.getTravelReason(),travellingRequestDetails.getTravelMode(),travellingRequestDetails.getTarvelStatus(),travellingRequestDetails.getProjectManagerStatus(),travellingRequestDetails.getDirectorstatus(),travellingRequestDetails.getEmployeeDetails(),travellingRequestDetails.getTravelLocation(),travellingRequestDetails.getTravelDetails(),travellingRequestDetails.getTravelDocumentDetails()};
		resultCount=jdbcTemplate.update(INSERT_TravellingRequestDetails,args);
		if(resultCount>0)
			return true;
		else 
			return false;
	}

	@Override
	public boolean updateTravellingRequestDetailsBytravelRequestId(TravellingRequestDetails travellingRequestDetails) {
		Object[] args= {travellingRequestDetails.getTravelDepartureDate(),travellingRequestDetails.getTravelReturndate(),travellingRequestDetails.getTravelReason(),travellingRequestDetails.getTravelMode(),travellingRequestDetails.getTarvelStatus(),travellingRequestDetails.getProjectManagerStatus(),travellingRequestDetails.getDirectorstatus(),travellingRequestDetails.getEmployeeDetails(),travellingRequestDetails.getTravelLocation(),travellingRequestDetails.getTravelDetails(),travellingRequestDetails.getTravelDocumentDetails(),travellingRequestDetails.getTravelRequestId()};
		resultCount=jdbcTemplate.update(UPDATE_travelTravellingRequestDetailsBytravelRequestId,args);
		if(resultCount>0)
			return true;
		else 
			return false;
	}

	@Override
	public boolean deleteTravellingRequestDetailsBytravelRequestId(int travelRequestId) {
		Object[] args = {travelRequestId};
		resultCount = jdbcTemplate.update(DELETE_TravellingRequestDetailsBytravelRequestId, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public TravellingRequestDetails getTravellingRequestDetailsBytravelRequestId(int travelRequestId) {
		Object[] args = { travelRequestId };
		TravellingRequestDetails travellingRequestDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_TravellingRequestDetailsBytravelRequestId, new TravlingRequestDetailsRowMapper(), args);
		return travellingRequestDetails;
	}

	@Override
	public List<TravellingRequestDetails> getAllTravellingRequestDetails() {
		List<TravellingRequestDetails> travellingRequestDetails = jdbcTemplate.query(SELECT_ALL_TravellingRequestDetails, new  TravlingRequestDetailsRowMapper());
		return travellingRequestDetails ;
	}

}
