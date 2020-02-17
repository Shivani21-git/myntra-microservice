package com.myntra.itineraryservice.repository;

import com.myntra.itineraryservice.model.clotherservice.Cloth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothRepository extends CrudRepository<Cloth, Long> {

}
