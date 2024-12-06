package com.thirdgear.example.erp_api_demo.entity_mgmnt.service;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;
import com.thirdgear.example.erp_api_demo.core.entity.TankStatus;

public interface TankStatusMgmntService {

	public Iterable<TankStatus>listTankStatuses();
	
	/**
	 * 
	 * @param tank
	 * @return
	 */
	public Tank createTankStatus(TankStatus tankStatus);
	
	/**
	 * 
	 */
	public Tank updateOperationCode(TankStatus tankStatus);
	
	/**
	 * 
	 */
	public void archiveTankStatus(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Tank getById(int id);
	
}
