package com.wc_matthew.demo.erp.entity_mgmnt.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wc_matthew.demo.erp.core.entity.TankType;
import com.wc_matthew.demo.erp.entity_mgmnt.service.TankTypeMgmntService;


@RestController
@RequestMapping("/mgmnt/tankType")
public class TankTypeMgmntController extends BaseController{
	
	@Autowired
	TankTypeMgmntService tankTypeService;
	
	@GetMapping
    public Iterable<TankType> getTankTypes(){
    	Iterable<TankType> tankTypes = tankTypeService.getTankTypes();
        return tankTypes;
    } 
    
	
    @PostMapping    
    public ResponseEntity<TankType> post(TankType tankType){
        TankType result =  tankTypeService.createTankType(tankType);
        return ResponseEntity.created(getLocationRef(result.getId())).headers(getHeaders()).body(result);
    }

    @PutMapping
    public ResponseEntity<TankType>put(TankType tankType){
    	TankType result = tankTypeService.updateTankType(tankType);
        return ResponseEntity.created(getLocationRef(result.getId())).headers(getHeaders()).body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        tankTypeService.archiveTankType(id);
        return ResponseEntity.noContent().build();
    }
}
