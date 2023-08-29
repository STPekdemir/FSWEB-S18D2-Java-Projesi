package com.workintech.D2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="fruit",schema = "spring")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private double price;

    @Enumerated(value = EnumType.STRING)
    private FruitType  fruitType;
}
