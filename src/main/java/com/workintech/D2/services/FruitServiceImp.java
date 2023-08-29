package com.workintech.D2.services;

import com.workintech.D2.dao.FruitRepository;
import com.workintech.D2.entity.Fruit;
import jakarta.transaction.Transactional;
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
    @Transactional
    public List<Fruit> getAll() {
        return fruitRepository.findAll();
    }

    @Override
    @Transactional
    public Fruit getById(int id) {
        Optional<Fruit> fruit = fruitRepository.findById(id);
        if(fruit.isPresent()){
            return fruit.get();
        }
        return null;
    }

    @Override
    @Transactional
    public void deletById(int id) {
        fruitRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Fruit save(Fruit fru) {
        return fruitRepository.save(fru);
    }

    @Override
    @Transactional
    public List<Fruit> getByParameter(String param) {
        return fruitRepository.getByParameter(param);
    }

    @Override
    @Transactional
    public List<Fruit> getByPriceAsc() {
        return fruitRepository.getByPriceAsc();
    }

    @Override
    @Transactional
    public List<Fruit> getByPriceDesc() {
        return fruitRepository.getByPriceDesc();
    }
}
