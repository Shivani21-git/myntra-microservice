package com.myntra.storeservice.controller;

import com.myntra.storeservice.model.Store;
import com.myntra.storeservice.service.ServiceStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storeservice")
public class storecontroller {

    @Autowired
    ServiceStore serviceStore;

    @GetMapping("/{clothid}")
    public Store getQuantity(@PathVariable( value = "clothid") Long clothid){
        return serviceStore.getQuantity(clothid);
    }


    }
