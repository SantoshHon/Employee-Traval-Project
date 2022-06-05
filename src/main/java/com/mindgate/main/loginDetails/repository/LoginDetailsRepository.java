package com.mindgate.main.loginDetails.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.loginDetails.pojo.LoginDetails;

@Repository
public class LoginDetailsRepository implements LoginDetailsRepositoryInterface {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String INSERT_LoginDetails = "INSERT INTO LOGIN_DETAILS(PASSWORD,ROLE) VALUES(?,?)";
	private static final String SELECT_ALL_LoginDetails = "SELECT * FROM LoginDetails";
	private static final String SELECT_SINGLE_LoginDetails = "SELECT * FROM LoginDetails WHERE LOGIN_ID = ?";
	private static final String UPDATE_LoginDetails = "UPDATE LoginDetails SET PASSWORD = ? , ROLE = ? "
			+ "	WHERE LOGIN_ID = ?";
	private static final String DELETE_LoginDetails = "DELETE LoginDetails WHERE LOGIN_ID = ?";

	private int resultCount;
	//@Override
	public boolean addLoginDetails(LoginDetails loginDetails) {
		
		System.out.println("inserting new loginDetails into database");
		System.out.println(loginDetails);

		Object[] args = { loginDetails.getPassword(), loginDetails.getRole() };
		
		resultCount = jdbcTemplate.update(INSERT_LoginDetails, args);

		if (resultCount > 0)
			return true;
		else
			return false;
		
	}

	//@Override
	public boolean updateLoginDetails(LoginDetails loginDetails) {
		Object[] args = { loginDetails.getPassword(), loginDetails.getRole(), loginDetails.getLoginId() };
		resultCount = jdbcTemplate.update(UPDATE_LoginDetails, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	//@Override
	public boolean deleteLoginDetails(int loginId) {
		Object[] args = { loginId };
		resultCount = jdbcTemplate.update(DELETE_LoginDetails, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	//@Override
	public LoginDetails getLoginDetailsByloginId(int loginId) {
		Object[] args = { loginId };
		LoginDetails details = jdbcTemplate.queryForObject(SELECT_SINGLE_LoginDetails , new LoginDetailRowMapper(), args);
		return details;
	}

	//@Override
	public List<LoginDetails> getAllLoginDetails() {
		
		List<LoginDetails> details = jdbcTemplate.query(SELECT_ALL_LoginDetails, new LoginDetailRowMapper());
		return details ;
		
	}

	

}
