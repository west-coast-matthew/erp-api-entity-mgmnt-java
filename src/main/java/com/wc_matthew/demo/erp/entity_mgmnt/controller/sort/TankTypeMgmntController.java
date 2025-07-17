package com.wc_matthew.demo.erp.entity_mgmnt.controller.sort;

import org.springframework.beans.factory.annotation.Autowired;
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
public class TankTypeMgmntController {
	
	@Autowired
	TankTypeMgmntService tankTypeService;
	
	@GetMapping
    public Iterable<TankType> getTankTypes(){
    	
    	Iterable<TankType> tankTypes = tankTypeService.getTankTypes();
    	
        return tankTypes;
    } 
    
    @PostMapping    
    public TankType post(TankType tankType){
        return tankTypeService.createTankType(tankType);
    }

    @PutMapping
    public TankType put(TankType tankType){
        return tankTypeService.updateTankType(tankType);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        tankTypeService.archiveTankType(id);
    }
}
