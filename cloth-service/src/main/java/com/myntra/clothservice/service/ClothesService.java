package com.myntra.clothservice.service;

import com.myntra.clothservice.model.Cloth;
import com.myntra.clothservice.model.priceservice.Price;
import com.myntra.clothservice.model.storeservice.Store;
import com.myntra.clothservice.repository.ClothRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ClothesService {

    @Autowired
    ClothRepository clothRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<Cloth> getAllCloth(String gender) {
        List<Cloth> cloths = clothRepository.findByGender(gender);
        cloths.forEach(c -> {
            Price price = restTemplate.getForObject("http://price-service/priceservice/" + c.getId(), Price.class);
            Store store = restTemplate.getForObject("http://store-service/storeservice/" + c.getId(), Store.class);
            c.setAmount(price.getAmount());
            c.setQuantity(store.getQuantity());
        });
        return cloths;

    }



    }
