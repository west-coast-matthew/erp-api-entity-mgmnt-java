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

import com.wc_matthew.demo.erp.core.entity.WorkOrderStatus;
import com.wc_matthew.demo.erp.entity_mgmnt.service.WorkOrderStatusMgmntService;

@RestController
@RequestMapping("/mgmnt/workOrder")
public class WorkOrderStatusMgmntController extends BaseController{
		
	@Autowired
	WorkOrderStatusMgmntService woStatusService;
	
	@GetMapping
    public Iterable<WorkOrderStatus> listWorkOrderStatues(){
    	Iterable<WorkOrderStatus> statuses = woStatusService.listWorkOrderStatus();
    	return statuses;
    } 
    
    @PostMapping    
    public ResponseEntity<WorkOrderStatus> post(WorkOrderStatus status){
    	WorkOrderStatus result = woStatusService.createWorkOrderStatus(status);
    	
    	return ResponseEntity.created(getLocationRef(result.getId())).headers(getHeaders()).body(result);
    }

    @PutMapping
    public ResponseEntity<WorkOrderStatus> put(WorkOrderStatus status){
    	WorkOrderStatus result = woStatusService.updateWorkOrderStatus(status);
    	
    	return ResponseEntity.created(getLocationRef(result.getId())).headers(getHeaders()).body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
    	woStatusService.archiveWorkOrderStatus(id);
    	return ResponseEntity.noContent().build();
    }
}
