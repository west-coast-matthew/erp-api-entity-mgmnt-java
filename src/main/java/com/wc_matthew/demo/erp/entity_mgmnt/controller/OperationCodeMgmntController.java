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

import com.wc_matthew.demo.erp.core.entity.OperationCode;
import com.wc_matthew.demo.erp.entity_mgmnt.service.OperationCodeMgmntService;

@RestController
@RequestMapping("/mgmnt/operationCode")
public class OperationCodeMgmntController extends BaseController{
	

    @Autowired
    OperationCodeMgmntService opCodeService;

    @GetMapping
    public Iterable<OperationCode> getOperationCodes(){
    	Iterable<OperationCode> opCodes  = opCodeService.listOperationCodes();
        return opCodes;
    } 
    
    @PostMapping    
    public ResponseEntity<OperationCode> post(OperationCode opCode){
    	OperationCode result = opCodeService.createOperationCode(opCode);
    	return ResponseEntity.created(getLocationRef(result.getId())).headers(getHeaders()).body(result);
    }

    @PutMapping
    public ResponseEntity<OperationCode> put(OperationCode opCode){
    	OperationCode result =  opCodeService.updateOperationCode(opCode);
    	return ResponseEntity.created(getLocationRef(result.getId())).headers(getHeaders()).body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
    	opCodeService.archiveOperationCode(id);
    	return ResponseEntity.noContent().build();
    }
    
    
    
}
