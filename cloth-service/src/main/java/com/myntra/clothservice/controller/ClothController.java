package com.myntra.clothservice.controller;

import com.myntra.clothservice.model.Cloth;
import com.myntra.clothservice.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getclothes")
public class ClothController {

    @Autowired
    ClothesService clothesService;

    @GetMapping("/{gender}")
    public List<Cloth> getClothes(@PathVariable(value = "gender") String gender) {
        return clothesService.getAllCloth(gender);

    }
}
