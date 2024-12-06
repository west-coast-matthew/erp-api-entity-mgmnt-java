package com.thirdgear.example.erp_api_demo.entity_mgmnt.service;

import java.util.List;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;
import com.thirdgear.example.erp_api_demo.core.entity.TankType;

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
