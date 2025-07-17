package com.wc_matthew.demo.erp.entity_mgmnt.service;

import java.util.List;

import com.wc_matthew.demo.erp.core.entity.Tank;


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
	public void archiveTank(Long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Tank getById(Long id);
	
	/**
	 * 
	 * @return
	 */
	public Iterable<Tank>getTanks();
	
	public boolean exists(Long id);
	
}