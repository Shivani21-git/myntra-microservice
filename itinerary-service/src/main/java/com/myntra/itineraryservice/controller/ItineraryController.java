package com.myntra.itineraryservice.controller;

import com.myntra.itineraryservice.model.Itinerary;
import com.myntra.itineraryservice.model.clotherservice.Cloth;
import com.myntra.itineraryservice.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/goshopping")
public class ItineraryController {

    @Autowired
    ItineraryService itineraryService;

    @GetMapping("/{gender}")
    public Itinerary getItinerary(@PathVariable(value = "gender") String gender){

        List<Cloth> clothes =  itineraryService.getAllCloth(gender);

        Itinerary itinerary = new Itinerary(clothes);

        return itinerary;
    }


}
