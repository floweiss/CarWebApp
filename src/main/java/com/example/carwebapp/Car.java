package com.example.carwebapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "t_cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 10)
    private String brand;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private Integer buildYear;

    public Car(String brand, String name, Integer buildYear) {
        this(null, brand, name, buildYear);
    }
}
