package com.workintech.D2.services;

import com.workintech.D2.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    List<Vegetable> getAll();
    Vegetable getById(int id);
    void deletById(int id);
    Vegetable save(Vegetable veg);
    List<Vegetable> getByParameter(String param);
    List<Vegetable> getByPriceAsc();
    List<Vegetable> getByPriceDesc();

}
