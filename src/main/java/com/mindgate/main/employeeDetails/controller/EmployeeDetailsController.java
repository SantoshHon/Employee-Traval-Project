package com.mindgate.main.employeeDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.employeeDetails.pojo.EmployeeDetails;
import com.mindgate.main.employeeDetails.service.EmployeeDetailsServiceInterface;

@RestController
@RequestMapping("employeetraval")
public class EmployeeDetailsController {
@Autowired
private EmployeeDetailsServiceInterface employeeDetailsServiceInterface;
@RequestMapping(value = "employeedetails", method = RequestMethod.POST)
public boolean addLoginDetails(@RequestBody EmployeeDetails employeeDetails)
{ System.out.println(employeeDetails);
	return  employeeDetailsServiceInterface.addEmployeeDetails(employeeDetails);

}

}
