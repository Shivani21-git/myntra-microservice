package com.myntra.itineraryservice.repository;

import com.myntra.itineraryservice.model.storeservice.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<Store,Long> {
}
