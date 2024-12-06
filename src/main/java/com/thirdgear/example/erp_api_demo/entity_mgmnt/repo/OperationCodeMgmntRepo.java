package com.thirdgear.example.erp_api_demo.entity_mgmnt.repo;

import org.springframework.data.repository.CrudRepository;
import com.thirdgear.example.erp_api_demo.core.entity.OperationCode;

public interface OperationCodeMgmntRepo extends CrudRepository<OperationCode, Long>{

}
