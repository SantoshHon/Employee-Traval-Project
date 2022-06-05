package com.mindgate.main.traveldetails.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.traveldetails.pojo.TravelDetails;

public class TravelDetailsRowMapper implements RowMapper<TravelDetails> {

	@Override
	public TravelDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int travelDetailsId=resultSet.getInt("TRAVEL_DETAILS_ID");
		String hotelBookingStatus=resultSet.getString("HOTEL_BOOKING_STATUS");
		int hotelCost=resultSet.getInt("HOTEL_COST");
		Date travelDepartureDate=resultSet.getDate("TRAVEL_DEPARTURE_DATE");
		LocalDate localDate=travelDepartureDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		Date travelReturndate=resultSet.getDate("TRAVEL_RETURN_DATE");
		LocalDate localDate1=travelDepartureDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String ticketbookingStatus=resultSet.getString("TICKET_BOOKING_STATUS");
		int ticketCost=resultSet.getInt("TICKET_COST");
		int foodCost=resultSet.getInt("FOOD_COST");
		int otherExpences=resultSet.getInt("OTHER_EXPENCES");
		int totalCost=resultSet.getInt("TOTAL_COST");
		
		TravelDetails travelDetails=new TravelDetails(travelDetailsId, hotelBookingStatus, hotelCost, localDate, localDate1, ticketbookingStatus, ticketCost, foodCost, otherExpences, totalCost);

		return travelDetails;
	}

}
