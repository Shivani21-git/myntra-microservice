package com.myntra.priceservice.controller;

import com.myntra.priceservice.model.Price;
import com.myntra.priceservice.service.ServicePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/priceservice")
public class PriceController {
    @Autowired
    ServicePrice servicePrice;

    @GetMapping("/{clothid}")
    public Price getPrice(@PathVariable( value = "clothid") Long clothid){
       return servicePrice.getPrice(clothid);

    }
}
