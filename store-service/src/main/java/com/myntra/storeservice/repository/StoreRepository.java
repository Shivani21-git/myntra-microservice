package com.myntra.storeservice.repository;

import com.myntra.storeservice.model.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long> {
    public Store findQuantityByCloth_Id(Long itemId);
}