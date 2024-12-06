package com.thirdgear.example.erp_api_demo.entity_mgmnt.service;

import java.util.List;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;

/**
 * TankMgmntService
 * 
 * 	Responsible for read and write operations for the tank entity. Whereas the is a TankService in the 'erp core'
 *  module, it only provides read operations for the tank entity. This service provides read in additional write 
 *  operations for the entity.  
 *  
 * 
 */
public interface TankMgmntService{
	
	/**
	 * 
	 * @param tank
	 * @return
	 */
	public Tank createTank(Tank tank);
	
	/**
	 * 
	 */
	public Tank updateTank(Tank tank);
	
	/**
	 * 
	 */
	public void archiveTank(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Tank getById(int id);
	
	/**
	 * 
	 * @return
	 */
	public List<Tank>getTanks();
	
	
}