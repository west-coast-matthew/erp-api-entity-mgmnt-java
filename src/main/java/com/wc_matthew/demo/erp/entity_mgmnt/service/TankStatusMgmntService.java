package com.wc_matthew.demo.erp.entity_mgmnt.service;

import com.wc_matthew.demo.erp.core.entity.Tank;
import com.wc_matthew.demo.erp.core.entity.TankStatus;

public interface TankStatusMgmntService {

	public Iterable<TankStatus>listTankStatuses();
	
	/**
	 * 
	 * @param tank
	 * @return
	 */
	public TankStatus createTankStatus(TankStatus tankStatus);
	
	/**
	 * 
	 */
	public TankStatus updateOperationCode(TankStatus tankStatus);
	
	/**
	 * 
	 */
	public void archiveTankStatus(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public TankStatus getById(int id);
	
}
