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
	public void archiveOperationCode(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public OperationCode getById(int id);
	
}
