package com.workintech.D2.services;

import com.workintech.D2.dao.VegetableRepository;
import com.workintech.D2.entity.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableServiceImp implements VegetableService{
    private VegetableRepository vegetableRepository;
    @Autowired
    public VegetableServiceImp(VegetableRepository vegetableRepository){
        this.vegetableRepository=vegetableRepository;
    }

    @Override
    public List<Vegetable> getAll() {
        return vegetableRepository.findAll();
    }

    @Override
    public Vegetable getById(int id) {
        Optional<Vegetable> veg= vegetableRepository.findById(id);
        if(veg.isPresent()){
            return veg.get();
        }
        return null;
    }

    @Override
    public void deletById(int id) {
        vegetableRepository.deleteById(id);

    }

    @Override
    public Vegetable save(Vegetable veg) {
        return vegetableRepository.save(veg);
    }

    @Override
    public List<Vegetable> getByParameter(String param) {
        return vegetableRepository.getByParameter(param);
    }

    @Override
    public List<Vegetable> getByPriceAsc() {
        return vegetableRepository.getByPriceAsc();
    }

    @Override
    public List<Vegetable> getByPriceDesc() {
        return vegetableRepository.getByPriceDesc();
    }
}
