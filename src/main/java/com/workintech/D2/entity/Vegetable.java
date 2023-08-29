package com.workintech.D2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="vegatable",schema = "spring")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Positive
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;
    @Column(name="is_grown_on_tree")
    private boolean isGrownOnTree;
}
