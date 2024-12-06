package com.thirdgear.example.erp_api_demo.entity_mgmnt.service;

import com.thirdgear.example.erp_api_demo.core.entity.OperationCode;
import com.thirdgear.example.erp_api_demo.core.entity.Tank;

public interface OperationCodeMgmntService {

	public Iterable<OperationCode>listOperationCodes();
	
	/**
	 * 
	 * @param tank
	 * @return
	 */
	public OperationCode createOperationCode(OperationCode operationCode);
	
	/**
	 * 
	 */
	public OperationCode updateOperationCode(OperationCode operationCode);
	
	/**
	 * 
	 */
	public void archiveOperationCode(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public OperationCode getById(int id);
	
}
