package org.example.unitconverterbackend.service;

import org.example.unitconverterbackend.model.Length;
import org.example.unitconverterbackend.model.Temperature;
import org.example.unitconverterbackend.model.Weight;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {
    public double convertLength(double value, Length from, Length to) {
        return value * from.getValue() / to.getValue();
    }
    public double convertWeight(double value, Weight from, Weight to) {
        return value * from.getValue() / to.getValue();
    }
    public double convertTemperature(double value, Temperature from, Temperature to) {

        return value * to.getValue()/from.getValue();
    }

}
