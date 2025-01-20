package org.example.unitconverterbackend.controllers;

import org.example.unitconverterbackend.model.Length;
import org.example.unitconverterbackend.model.Temperature;
import org.example.unitconverterbackend.model.Weight;
import org.example.unitconverterbackend.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/converter")
public class ConverterController {
    @Autowired
    private ConverterService converterService;
    @GetMapping("/length/{value}/{from}/{to}")
    public ResponseEntity<Double> convertLength(@PathVariable double value, @PathVariable Length from, @PathVariable Length to) {
        return ResponseEntity.ok(converterService.convertLength(value, from, to));
    }
    @GetMapping("/weight/{value}/{from}/{to}")
    public ResponseEntity<Double> convertWeight(@PathVariable double value, @PathVariable Weight from, @PathVariable Weight to) {
        return ResponseEntity.ok(converterService.convertWeight(value, from, to));
    }
    @GetMapping("/temperature/{value}/{from}/{to}")
    public ResponseEntity<Double> convertTemperature(@PathVariable double value, @PathVariable Temperature from, @PathVariable Temperature to) {
        return ResponseEntity.ok(converterService.convertTemperature(value, from, to));
    }

}
