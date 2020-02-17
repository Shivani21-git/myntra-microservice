package com.myntra.priceservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id")
    Long id;

    Long amount;

    @OneToOne
    @JsonIgnore
    Cloth cloth;

    public Price() {
    }

    public Price(Long amount, Cloth cloth) {
        this.amount = amount;
        this.cloth = cloth;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }
}
