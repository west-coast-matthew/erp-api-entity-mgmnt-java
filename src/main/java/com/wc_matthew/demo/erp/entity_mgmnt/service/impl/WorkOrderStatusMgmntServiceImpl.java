package com.wc_matthew.demo.erp.entity_mgmnt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wc_matthew.demo.erp.core.entity.WorkOrderStatus;
import com.wc_matthew.demo.erp.core.exception.EntityExistsException;
import com.wc_matthew.demo.erp.entity_mgmnt.repo.WorkOrderStatusMgmntRepo;
import com.wc_matthew.demo.erp.entity_mgmnt.service.WorkOrderStatusMgmntService;

@Service("WorkOrderStatusMgmntService")
public class WorkOrderStatusMgmntServiceImpl implements WorkOrderStatusMgmntService
{
	
	@Autowired
	WorkOrderStatusMgmntRepo repo;

	@Override
	public Iterable<WorkOrderStatus> listWorkOrderStatus() {
		return repo.findAll();
	}

	@Override
	public WorkOrderStatus updateWorkOrderStatus(WorkOrderStatus woStatus) {
		
		if(!exists(woStatus.getId())) {
			throw new EntityExistsException("Unable to locate work order status "+ woStatus.getId());
		}
		
		return repo.save(woStatus);
	}

	@Override
	public void archiveWorkOrderStatus(Long id) {
		if(!exists(id)) {
			throw new EntityExistsException("Unable to locate work order status "+ id);
		}
		
		WorkOrderStatus sel = getById(null);
		sel.setActive(false);
		repo.save(sel);
	}

	@Override
	public WorkOrderStatus getById(Long id) {
		Optional<WorkOrderStatus> sel =  repo.findById(id);
		if(sel.isPresent()) {
			return sel.get();
		}
		
		throw new EntityExistsException("Unable to locate work order status "+ id);
	}

	@Override
	public WorkOrderStatus createWorkOrderStatus(WorkOrderStatus woStatus) {
		return repo.save(woStatus);
	}

	@Override
	public boolean exists(Long id) {
		return repo.existsById(id);
	}

}
