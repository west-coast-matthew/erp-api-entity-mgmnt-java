package com.thirdgear.example.erp_api_demo.entity_mgmnt.repo;

import org.springframework.data.repository.CrudRepository;

import com.thirdgear.example.erp_api_demo.core.entity.WorkOrderStatus;

public interface WorkOrderStatusMgmntRepo extends CrudRepository<WorkOrderStatus, Long>{

}
