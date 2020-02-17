package com.myntra.clothservice.repository;

import com.myntra.clothservice.model.Cloth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothRepository extends CrudRepository<Cloth, Long> {
    public List<Cloth> findByGender(String gender);
}
