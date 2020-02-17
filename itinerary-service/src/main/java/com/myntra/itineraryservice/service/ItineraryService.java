package com.myntra.itineraryservice.service;

import com.myntra.itineraryservice.model.clotherservice.Cloth;
import com.myntra.itineraryservice.model.priceservice.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ItineraryService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    public List<Cloth> getAllCloth(String gender) {
        List<Cloth> clothes = webClientBuilder.build().get().uri("http://cloth-service/getclothes/"+ gender).header(HttpHeaders.CONTENT_TYPE,"application/json").
                header(HttpHeaders.CONTENT_TYPE,"Spring 5 WebClient").retrieve().bodyToMono(List.class).block();
        //List<Cloth> clothes = restTemplate.getForObject("http://localhost:8086/getclothes/" + gender, List.class);
        return clothes;
    }



}

