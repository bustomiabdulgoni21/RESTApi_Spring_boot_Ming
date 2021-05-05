package com.maven.spring.boot.update.models.repos;

import com.maven.spring.boot.update.models.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long>{
    
}
