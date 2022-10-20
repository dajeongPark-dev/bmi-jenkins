package com.example.bmi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * BMI Calculator Spring Application. */
@Service
public class Bmi {

    @Cacheable
    public double bmicalculator(double weight, double height) {
        return weight / (height * height);
    }

}
