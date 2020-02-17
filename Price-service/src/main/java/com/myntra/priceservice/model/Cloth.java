package com.myntra.priceservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    public class Cloth {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Long id;

        public String description;

        public String size;

        public String material;

        public String gender;

        public Cloth() {
        }

        public Cloth(Long id) {
        }

        public Cloth(Long id, String description, String size, String material, String gender) {
            this.id = id;
            this.description = description;
            this.size = size;
            this.material = material;
            this.gender = gender;
        }

        public Cloth(String description, String size, String material, String gender) {
            this.description = description;
            this.size = size;
            this.material = material;
            this.gender = gender;
        }


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
}
