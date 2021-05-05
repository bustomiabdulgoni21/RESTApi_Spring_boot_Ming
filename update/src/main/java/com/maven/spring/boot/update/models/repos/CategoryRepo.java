package com.maven.spring.boot.update.models.repos;

import com.maven.spring.boot.update.models.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long>{
    
}
