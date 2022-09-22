package com.kenzie.appserver.repositories;

import com.kenzie.appserver.repositories.model.StorageUnitRecord;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface StorageUnitRepository extends CrudRepository<StorageUnitRecord, String> {
}
