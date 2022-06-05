package com.mindgate.main.travlingRequestDetails.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.employeeDetails.pojo.EmployeeDetails;
import com.mindgate.main.travelDocumentDetails.pojo.TravelDocumentDetails;
import com.mindgate.main.traveldetails.pojo.TravelDetails;
import com.mindgate.main.travlingRequestDetails.pojo.TravellingRequestDetails;

public class TravlingRequestDetailsRowMapper implements RowMapper<TravellingRequestDetails>{

	@Override
	public TravellingRequestDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int travelRequestId = resultSet.getInt("TRAVEL_REQUEST_ID");
		Date travelDepartureDate = resultSet.getDate("TRAVEL_DEPARTURE_DATE");
		LocalDate localDate = travelDepartureDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Date travelReturndate = resultSet.getDate("TRAVEL_RETURN_DATE");
		LocalDate localDate1 = travelReturndate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String travelReason = resultSet.getString("TRAVEL_REASON");
		String vtravelMode = resultSet.getString("TRAVEL_MODE");
		String tarvelStatus = resultSet.getString("TRAVEL_STATUS");
		String ProjectManagerStatus = resultSet.getString("PROJECT_MANAGER_STATUS");
		String directorstatus = resultSet.getString("DIRECTOR_STATUS");
		String travelLocation = resultSet.getString("TRAVEL_LOCATION");
		EmployeeDetails employeeDetails = (EmployeeDetails) resultSet.getObject("EMPLOYEE_ID");
		TravelDetails travelDetails = (TravelDetails) resultSet.getObject("TRAVEL_DETAILS_ID");
		TravelDocumentDetails travelDocumentDetails = (TravelDocumentDetails) resultSet.getObject("DOCUMENT_ID");
		TravellingRequestDetails travellingRequestDetails=new TravellingRequestDetails(travelRequestId, localDate, localDate1, travelReason, vtravelMode, tarvelStatus, ProjectManagerStatus, directorstatus, travelLocation, employeeDetails, travelDetails, travelDocumentDetails);
		return travellingRequestDetails;
	}

}
