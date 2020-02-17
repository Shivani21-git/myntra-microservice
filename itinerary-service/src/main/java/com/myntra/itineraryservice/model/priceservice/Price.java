package com.myntra.itineraryservice.model.priceservice;

import com.myntra.itineraryservice.model.clotherservice.Cloth;

import javax.persistence.*;

@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id")
    Long id;

    Long amount;

    @OneToOne
    Cloth cloth;

    public Price() {
    }

    public Price(Long amount, Cloth cloth) {
        this.amount = amount;
        this.cloth = cloth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Price(Long id, Long amount) {
        this.id = id;
        this.amount = amount;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }
}
