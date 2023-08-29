package com.workintech.D2.services;

import com.workintech.D2.entity.Fruit;
import com.workintech.D2.entity.Vegetable;

import java.util.List;

public interface FruitService {
    List<Fruit> getAll();
    Fruit getById(int id);
    void deletById(int id);
    Fruit save(Fruit fru);
    List<Fruit> getByParameter(String param);
    List<Fruit> getByPriceAsc();
    List<Fruit> getByPriceDesc();

}
