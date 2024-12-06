package com.thirdgear.example.erp_api_demo.entity_mgmnt.service.impl;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.entity.WorkOrderStatus;
import com.thirdgear.example.erp_api_demo.entity_mgmnt.service.WorkOrderStatusMgmntService;

@Service("WorkOrderStatusMgmntService")
public class WorkOrderStatusMgmntServiceImpl implements WorkOrderStatusMgmntService
{

	@Override
	public Iterable<WorkOrderStatus> listWorkOrderStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorkOrderStatus updateWorkOrderStatus(WorkOrderStatus workOrderStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void archiveWorkOrderStatus(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WorkOrderStatus getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public WorkOrderStatus createWorkOrderStatus(WorkOrderStatus workOrderStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
