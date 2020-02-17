package com.myntra.itineraryservice.repository;

import com.myntra.itineraryservice.model.priceservice.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price,Long > {
}
