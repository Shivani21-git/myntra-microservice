package com.myntra.priceservice.repository;

import com.myntra.priceservice.model.Cloth;
import com.myntra.priceservice.model.Price;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {
    public Price findPriceByCloth_Id(Long itemId);
}
