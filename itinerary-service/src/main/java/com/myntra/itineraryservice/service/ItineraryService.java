package com.myntra.itineraryservice.service;

import com.myntra.itineraryservice.model.clotherservice.Cloth;
import com.myntra.itineraryservice.model.priceservice.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ItineraryService {

    @Autowired
    RestTemplate restTemplate;

    public List<Cloth> getAllCloth(String gender) {
        List<Cloth> clothes = restTemplate.getForObject("http://localhost:8086/getclothes/" + gender, List.class);
        return clothes;
    }

}

