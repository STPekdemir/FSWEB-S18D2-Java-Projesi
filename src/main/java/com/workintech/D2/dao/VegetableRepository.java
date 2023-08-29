package com.workintech.D2.dao;


import com.workintech.D2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository  extends JpaRepository<Vegetable,Integer> {
    @Query("SELECT f FROM Vegetable f ORDER BY f.price ASC ")
    List<Vegetable> getByPriceAsc();
    @Query("SELECT f FROM Vegetable f ORDER BY f.price DESC ")
    List<Vegetable> getByPriceDesc();
    @Query("SELECT v FROM Vegetable f WHERE v.name ilike %:name%")
    List<Vegetable> getByParameter(String param);
}
