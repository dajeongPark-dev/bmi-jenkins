package com.example.bmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * BMICalculatorController Spring Application. */
@RestController
public class BmiController {

    @Autowired
    private Bmi bmi;


    @RequestMapping(value = "/api/bmi", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getBMI_result(@RequestParam("weight") double weight,
                         @RequestParam("height") double height) {

        double bmi_level = 0.0;
        bmi_level = bmi.bmicalculator(weight,height);

        if (bmi_level >= 20.0 && bmi_level < 25.0) {
            return "Standard.";
        } else {
            return "Need to Take Care";
        }

    }
}
