package com.myntra.storeservice.service;

import com.myntra.storeservice.model.Store;
import com.myntra.storeservice.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceStore {

    @Autowired
    StoreRepository storeRepository;

    public Store getQuantity(Long id){
        return storeRepository.findQuantityByCloth_Id(id);

    }
}
