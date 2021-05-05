package com.maven.spring.boot.update.models.repos;

import javax.websocket.server.PathParam;

import com.maven.spring.boot.update.models.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
    @Query("SELECT p FROM p WHERE p.name = :name")
    public Product findProductByName(@PathParam("name") String name);
}
