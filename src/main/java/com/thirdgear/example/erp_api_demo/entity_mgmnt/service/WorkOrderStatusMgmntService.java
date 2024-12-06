package com.thirdgear.example.erp_api_demo.entity_mgmnt.service;

import com.thirdgear.example.erp_api_demo.core.entity.WorkOrderStatus;

public interface WorkOrderStatusMgmntService {

	public Iterable<WorkOrderStatus>listWorkOrderStatus();
	
	/**
	 * 
	 * @param tank
	 * @return
	 */
	WorkOrderStatus createWorkOrderStatus(WorkOrderStatus workOrderStatus);
	
	/**
	 * 
	 */
	public WorkOrderStatus updateWorkOrderStatus(WorkOrderStatus workOrderStatus);
	
	/**
	 * 
	 */
	public void archiveWorkOrderStatus(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public WorkOrderStatus getById(int id);
}
