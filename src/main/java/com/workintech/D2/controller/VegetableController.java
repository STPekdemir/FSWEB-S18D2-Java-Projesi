package com.workintech.D2.controller;

import com.workintech.D2.entity.Vegetable;
import com.workintech.D2.services.VegetableService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vegetables")
public class VegetableController {
    private VegetableService vegetableService;
    @Autowired
    public VegetableController(VegetableService vegetableService){
        this.vegetableService=vegetableService;
    }
    @GetMapping("/")
    public List<Vegetable> getAllAsc(){
        return vegetableService.getByPriceAsc();
    }
    @GetMapping("/desc")
    public List<Vegetable> getAllDesc(){
        return vegetableService.getByPriceDesc();
    }
    @GetMapping("/{id}")
    public Vegetable getById(@PathVariable int id){
        return vegetableService.getById(id);
    }
    @PostMapping("/")
    public Vegetable create(@Validated @RequestBody Vegetable veg){
        return vegetableService.save(veg);
    }
    @PutMapping("/")
    public Vegetable update(@RequestBody Vegetable veg){
        return vegetableService.save(veg);
    }
    @GetMapping("/{name}")
    public List<Vegetable> getByName(@PathVariable String name){
        return vegetableService.getByParameter(name);
    }
    @DeleteMapping("/param/{name}")
    public void delete(@PathVariable int id){
        vegetableService.deletById(id);
    }
}
