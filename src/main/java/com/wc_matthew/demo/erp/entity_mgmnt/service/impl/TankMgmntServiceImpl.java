package com.wc_matthew.demo.erp.entity_mgmnt.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wc_matthew.demo.erp.core.entity.Tank;
import com.wc_matthew.demo.erp.core.exception.EntityExistsException;
import com.wc_matthew.demo.erp.entity_mgmnt.repo.TankMgmntRepo;
import com.wc_matthew.demo.erp.entity_mgmnt.service.TankMgmntService;

@Service("TankMgmntService")
public class TankMgmntServiceImpl implements TankMgmntService{

	@Autowired
	TankMgmntRepo repo;
	
	@Override
	public Tank createTank(Tank tank) {
		return repo.save(tank);
	}

	@Override
	public Tank updateTank(Tank tank) {
		
		if(!exists(tank.getId())) {
			throw new EntityExistsException("Unable to locate tank "+ tank.getId());
		}
		
		return repo.save(tank);
	}

	@Override
	public void archiveTank(Long id) {
		if(!exists(id)) {
			throw new EntityExistsException("Unable to locate tank "+ id);
		}
		
		Tank sel = getById(null);
		sel.setActive(false);
		repo.save(sel);
	}

	@Override
	public Tank getById(Long id) {
		Optional<Tank> sel =  repo.findById(id);
		if(sel.isPresent()) {
			return sel.get();
		}
		
		throw new EntityExistsException("Unable to locate tank "+ id);
	}

	@Override
	public Iterable<Tank> getTanks() {
		return repo.findAll();
	}

	@Override
	public boolean exists(Long id) {
		return repo.existsById(id);
	}

}
