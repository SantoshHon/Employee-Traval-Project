package com.mindgate.main.slabmaster.repository;

import java.util.List;

import com.mindgate.main.loginDetails.pojo.LoginDetails;
import com.mindgate.main.slabmaster.pojo.SlabMaster;

public interface SlabMasterRepositoryInterface {
	public boolean addSlabMaster(SlabMaster slabMaster);
	public boolean updateSlabMasterBySlabMasterId(SlabMaster slabMaster);
	public boolean deleteSlabMaster(int slabMasterId);
	public SlabMaster getSlabMasterByslabMasterId(int slabMasterId);
	public List<SlabMaster>getAllSlabMaster();

}
