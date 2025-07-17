package com.wc_matthew.demo.erp.entity_mgmnt.service;

import com.wc_matthew.demo.erp.core.entity.WorkOrderStatus;

public interface WorkOrderStatusMgmntService {

	public Iterable<WorkOrderStatus>listWorkOrderStatus();
	
	/**
	 * 
	 * @param tank
	 * @return
	 */
	WorkOrderStatus createWorkOrderStatus(WorkOrderStatus woStatus);
	
	/**
	 * 
	 */
	public WorkOrderStatus updateWorkOrderStatus(WorkOrderStatus woStatus);
	
	/**
	 * 
	 */
	public void archiveWorkOrderStatus(Long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public WorkOrderStatus getById(Long id);
	
	public boolean exists(Long id);
}
