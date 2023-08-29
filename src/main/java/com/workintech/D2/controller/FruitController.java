package com.workintech.D2.controller;

import com.workintech.D2.entity.Fruit;

import com.workintech.D2.services.FruitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {
    private FruitService fruitService;
    @Autowired
    public FruitController(FruitService fruitService){
        this.fruitService=fruitService;
    }
    @GetMapping("/")
    public List<Fruit> getAllAsc(){
        return fruitService.getByPriceAsc();
    }
    @GetMapping("/desc")
    public List<Fruit> getAllDesc(){
        return fruitService.getByPriceDesc();
    }
    @GetMapping("/{id}")
    public Fruit getById(@PathVariable int id){
        return fruitService.getById(id);
    }
    @PostMapping("/")
    public Fruit create(@RequestBody Fruit veg){
        return fruitService.save(veg);
    }
    @PutMapping("/")
    public Fruit update(@RequestBody Fruit veg){
        return fruitService.save(veg);
    }
    @GetMapping("/param/{name}")
    public List<Fruit> getByName(@PathVariable String name){
        return fruitService.getByParameter(name);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        fruitService.deletById(id);
    }
}
