package com.wc_matthew.demo.erp.entity_mgmnt.service;

import java.util.List;

import com.wc_matthew.demo.erp.core.entity.TankType;


public interface TankTypeMgmntService {
	/**
	 * 
	 * @param tank
	 * @return
	 */
	public TankType createTankType(TankType tankType);
	
	/**
	 * 
	 */
	public TankType updateTankType(TankType tankType);
	
	/**
	 * 
	 */
	public void archiveTankType(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public TankType getById(int id);
	
	/**
	 * 
	 * @return
	 */
	public List<TankType>getTankTypes();
}
