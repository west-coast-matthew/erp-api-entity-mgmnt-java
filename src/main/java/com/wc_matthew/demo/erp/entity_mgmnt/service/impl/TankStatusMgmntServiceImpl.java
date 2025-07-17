package com.wc_matthew.demo.erp.entity_mgmnt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wc_matthew.demo.erp.core.entity.TankStatus;
import com.wc_matthew.demo.erp.core.exception.EntityExistsException;
import com.wc_matthew.demo.erp.entity_mgmnt.repo.TankStatusMgmntRepo;
import com.wc_matthew.demo.erp.entity_mgmnt.service.TankStatusMgmntService;

public class TankStatusMgmntServiceImpl implements TankStatusMgmntService{

	@Autowired 
	TankStatusMgmntRepo repo;
	
	@Override
	public Iterable<TankStatus> listTankStatuses() {
		return repo.findAll();
	}

	@Override
	public TankStatus createTankStatus(TankStatus tankStatus) {
		return repo.save(tankStatus);
	}

	@Override
	public TankStatus updateOperationCode(TankStatus tankStatus) {
		if(!exists(tankStatus.getId())) {
			throw new EntityExistsException("Unable to locate tank status "+ tankStatus.getId());
		}
		
		return repo.save(tankStatus);
	}

	@Override
	public void archiveTankStatus(Long id) {
		if(!exists(id)) {
			throw new EntityExistsException("Unable to locate tank status "+ id);
		}
		
		TankStatus sel = getById(null);
		sel.setActive(false);
		repo.save(sel);
	}

	@Override
	public TankStatus getById(Long id) {
		Optional<TankStatus> sel =  repo.findById(id);
		if(sel.isPresent()) {
			return sel.get();
		}
		
		throw new EntityExistsException("Unable to locate tank status "+ id);
	}

	@Override
	public boolean exists(Long id) {
		return repo.existsById(id);
	}
}
