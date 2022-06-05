package com.mindgate.main.travalAgentDetails.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.loginDetails.pojo.LoginDetails;
import com.mindgate.main.slabmaster.pojo.SlabMaster;
import com.mindgate.main.travalAgentDetails.pojo.TravalAgentDetails;

public class TravalAgentDetailRowMaster implements RowMapper<TravalAgentDetails> {

	@Override
	public TravalAgentDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int agentId = resultSet.getInt("TRAVLE_AGENT_ID");
		String travelAgentName = resultSet.getString("TRAVEL_AGENT_NAME");
		SlabMaster slabMaster = (SlabMaster) resultSet.getObject("SLAB_MASTER_ID");
		LoginDetails loginDetails = (LoginDetails) resultSet.getObject("LOGIN_ID");
		TravalAgentDetails travalAgentDetails=new TravalAgentDetails(agentId, travelAgentName, slabMaster, loginDetails);

		return travalAgentDetails;
	}
	

}
