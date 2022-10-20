package com.example.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * CalculatorTest Spring Application. */
public class BmiTest {
    private Bmi bmi = new Bmi();

    @Test
    public void testBMI() {
        assertEquals( "0.001957168128269788",String.valueOf(bmi.bmicalculator(52, 163)));
    }
}
