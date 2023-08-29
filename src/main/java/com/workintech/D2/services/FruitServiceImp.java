package com.workintech.D2.services;

import com.workintech.D2.dao.FruitRepository;
import com.workintech.D2.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FruitServiceImp implements FruitService{
    private FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImp(FruitRepository fruitRepository){
        this.fruitRepository=fruitRepository;
    }

    @Override
    public List<Fruit> getAll() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit getById(int id) {
        Optional<Fruit> fruit = fruitRepository.findById(id);
        if(fruit.isPresent()){
            return fruit.get();
        }
        return null;
    }

    @Override
    public void deletById(int id) {
        fruitRepository.deleteById(id);
    }

    @Override
    public Fruit save(Fruit fru) {
        return fruitRepository.save(fru);
    }

    @Override
    public List<Fruit> getByParameter(String param) {
        return fruitRepository.getByParameter(param);
    }

    @Override
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }
}
