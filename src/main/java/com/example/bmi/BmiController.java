package com.example.bmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * BMICalculatorController Spring Application. */
@RestController
public class BmiController {

    @Autowired
    private Bmi bmi;


    @RequestMapping("/bmi")
    String bim_result (@RequestParam("weight") double weight,
                @RequestParam("height") double height) {

//        double bmi_level = 0.0;
//        bmi_level = bmi.bmicalculator(weight,height);
//
//        if (bmi_level >=20 && bmi_level <25) {
//            return "Standard.";
//        } else {
//            return "Need to take care.";
//        }
        return String.valueOf(bmi.bmicalculator(weight,height));

    }
}
