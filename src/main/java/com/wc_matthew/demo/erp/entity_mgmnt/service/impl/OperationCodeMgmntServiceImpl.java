package com.wc_matthew.demo.erp.entity_mgmnt.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wc_matthew.demo.erp.core.entity.OperationCode;
import com.wc_matthew.demo.erp.core.exception.EntityExistsException;
import com.wc_matthew.demo.erp.entity_mgmnt.repo.OperationCodeMgmntRepo;
import com.wc_matthew.demo.erp.entity_mgmnt.service.OperationCodeMgmntService;

@Service("OperationCodeMgmntService")
public class OperationCodeMgmntServiceImpl implements OperationCodeMgmntService{

	@Autowired
	OperationCodeMgmntRepo repo;
	
	@Override
	public Iterable<OperationCode> listOperationCodes() {
		return repo.findAll();
	}

	@Override
	public OperationCode createOperationCode(OperationCode opCode) {
		return repo.save(opCode);
	}

	@Override
	public OperationCode updateOperationCode(OperationCode opCode) {
		
		if(!exists(opCode.getId())) {
			throw new EntityExistsException("Unable to locate op code "+ opCode.getId());
		}
		
		return repo.save(opCode);
	}

	@Override
	public void archiveOperationCode(Long id) {
		
		if(!exists(id)) {
			throw new EntityExistsException("Unable to locate op code "+ id);
		}
		
		OperationCode sel = getById(null);
		sel.setActive(false);
		repo.save(sel);
	}

	@Override
	public OperationCode getById(Long id) {
		Optional<OperationCode> sel =  repo.findById(id);
		if(sel.isPresent()) {
			return sel.get();
		}
		
		throw new EntityExistsException("Unable to locate op code "+ id);
	}

	@Override
	public boolean exists(Long id) {
		return repo.existsById(id);
	}

}
