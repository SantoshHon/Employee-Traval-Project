package com.mindgate.main.slabmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.loginDetails.pojo.LoginDetails;
import com.mindgate.main.slabmaster.pojo.SlabMaster;
import com.mindgate.main.slabmaster.service.SlabMasterServiceInterface;

@RestController
@RequestMapping("slab")
public class SlabMasterController {
	@Autowired
	private SlabMasterServiceInterface masterServiceInterface;
	@RequestMapping(value = "slabmaster", method = RequestMethod.POST)
	public boolean addSlabMaster(@RequestBody SlabMaster slabMaster)
	{System.out.println(slabMaster);
		return masterServiceInterface.addSlabMaster(slabMaster);
		
	}

}
