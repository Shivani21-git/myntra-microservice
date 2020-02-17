package com.myntra.priceservice.service;

import com.myntra.priceservice.model.Cloth;
import com.myntra.priceservice.model.Price;
import com.myntra.priceservice.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePrice {

    @Autowired
    PriceRepository priceRepository;

    public Price getPrice(Long id) {
        return priceRepository.findPriceByCloth_Id(id);
    }

}

