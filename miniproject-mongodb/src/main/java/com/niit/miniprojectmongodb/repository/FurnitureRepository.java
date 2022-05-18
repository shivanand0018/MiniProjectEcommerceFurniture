package com.niit.miniprojectmongodb.repository;

import com.niit.miniprojectmongodb.model.Furniture;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FurnitureRepository extends MongoRepository<Furniture,Integer> {
}
