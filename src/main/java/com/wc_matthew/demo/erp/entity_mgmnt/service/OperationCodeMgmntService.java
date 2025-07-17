package com.wc_matthew.demo.erp.entity_mgmnt.service;

import com.wc_matthew.demo.erp.core.entity.OperationCode;

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
	public void archiveOperationCode(Long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public OperationCode getById(Long id);
	
	public boolean exists(Long id);
}
