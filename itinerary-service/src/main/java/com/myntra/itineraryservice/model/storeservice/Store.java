package com.myntra.itineraryservice.model.storeservice;

import com.myntra.itineraryservice.model.clotherservice.Cloth;

import javax.persistence.*;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "cloth_quantity")
    int quantity;

    @OneToOne
    Cloth cloth;

    public Store() {
    }

    public Store(int quantity) {
        this.quantity = quantity;
    }

    public Store(int quantity, Cloth cloth) {
        this.quantity = quantity;
        this.cloth = cloth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }
}
