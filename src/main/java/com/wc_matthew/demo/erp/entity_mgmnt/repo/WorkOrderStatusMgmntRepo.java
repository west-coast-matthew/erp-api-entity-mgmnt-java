package com.wc_matthew.demo.erp.entity_mgmnt.repo;

import org.springframework.data.repository.CrudRepository;

import com.wc_matthew.demo.erp.core.entity.WorkOrderStatus;


public interface WorkOrderStatusMgmntRepo extends CrudRepository<WorkOrderStatus, Long>{

}
