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

import com.wc_matthew.demo.erp.core.entity.Tank;
import com.wc_matthew.demo.erp.entity_mgmnt.service.TankMgmntService;


@RestController
@RequestMapping("/mgmnt/tank")
public class TankMgmntController extends BaseController{
	
    @Autowired
    TankMgmntService tankService;

    @GetMapping
    public Iterable<Tank> getTanks(){
    	Iterable<Tank> tanks = tankService.getTanks();
        return tanks;
    } 
    
    @PostMapping    
    public ResponseEntity<Tank> post(Tank tank){
        Tank result = tankService.createTank(tank);
        return ResponseEntity.created(getLocationRef(result.getId())).headers(getHeaders()).body(result);
    }

    @PutMapping
    public ResponseEntity<Tank> put(Tank tank){
    	Tank result = tankService.updateTank(tank);
    	return ResponseEntity.created(getLocationRef(result.getId())).headers(getHeaders()).body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        tankService.archiveTank(id);
        return ResponseEntity.noContent().build();
    }

}
