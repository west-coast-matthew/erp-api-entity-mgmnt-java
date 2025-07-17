package com.wc_matthew.demo.erp.entity_mgmnt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wc_matthew.demo.erp.core.entity.TankType;
import com.wc_matthew.demo.erp.core.exception.EntityExistsException;
import com.wc_matthew.demo.erp.entity_mgmnt.repo.TankTypeMgmntRepo;
import com.wc_matthew.demo.erp.entity_mgmnt.service.TankTypeMgmntService;

@Service("TankTypeMgmntService")
public class TankTypeMgmntServiceImpl implements TankTypeMgmntService{

	@Autowired
	TankTypeMgmntRepo repo;
	
	@Override
	public TankType createTankType(TankType tankType) {
		return repo.save(tankType);
	}

	@Override
	public TankType updateTankType(TankType tankType) {
		
		if(!exists(tankType.getId())) {
			throw new EntityExistsException("Unable to locate tank type "+ tankType.getId());
		}
		
		return repo.save(tankType);
	}

	@Override
	public void archiveTankType(Long id) {
		if(!exists(id)) {
			throw new EntityExistsException("Unable to locate tank type "+ id);
		}
		
		TankType sel = getById(null);
		sel.setActive(false);
		repo.save(sel);
		
	}

	@Override
	public TankType getById(Long id) {
		Optional<TankType> sel =  repo.findById(id);
		if(sel.isPresent()) {
			return sel.get();
		}
		
		throw new EntityExistsException("Unable to locate tank type "+ id);
	}

	@Override
	public Iterable<TankType> getTankTypes() {
		return repo.findAll();
	}

	@Override
	public boolean exists(Long id) {
		return repo.existsById(id);
	}
	
}
