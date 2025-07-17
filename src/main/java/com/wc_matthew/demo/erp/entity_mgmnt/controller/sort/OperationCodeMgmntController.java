package com.wc_matthew.demo.erp.entity_mgmnt.controller.sort;

import org.springframework.beans.factory.annotation.Autowired;
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
public class OperationCodeMgmntController {
	

    @Autowired
    OperationCodeMgmntService opCodeService;

    @GetMapping
    public Iterable<OperationCode> getOperationCodes(){
    	
    	Iterable<OperationCode> opCodes  = opCodeService.listOperationCodes();
    	
        return opCodes;
    } 
    
    @PostMapping    
    public OperationCode post(OperationCode opCode){
    	return opCodeService.createOperationCode(opCode);
    }

    @PutMapping
    public OperationCode put(OperationCode opCode){
    	return opCodeService.updateOperationCode(opCode);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
    	opCodeService.archiveOperationCode(id);
    }
    
}
