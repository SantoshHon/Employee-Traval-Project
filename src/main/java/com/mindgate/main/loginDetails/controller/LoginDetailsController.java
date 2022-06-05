package com.mindgate.main.loginDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.loginDetails.pojo.LoginDetails;
import com.mindgate.main.loginDetails.service.LoginDetailsServiceInterFace;

@RestController
@RequestMapping("logins")
public class LoginDetailsController {
	@Autowired
	private LoginDetailsServiceInterFace LoginDetailsServiceInterFace;
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public boolean addLoginDetails(@RequestBody LoginDetails loginDetails)
	{System.out.println(loginDetails);
		return LoginDetailsServiceInterFace.addLoginDetails(loginDetails);
		
		
	}

}
