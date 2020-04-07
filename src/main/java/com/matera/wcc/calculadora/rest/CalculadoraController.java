package com.matera.wcc.calculadora.rest;

import com.matera.wcc.calculadora.service.CalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @GetMapping("/calculadora/add")
    public double add(@RequestParam("x") double x, @RequestParam("y") double y) {
        return this.service.add(x, y);
    }

    @GetMapping("/calculadora/subtract")
    public double subtract(@RequestParam("x") double x, @RequestParam("y") double y) {
        return this.service.subtract(x, y);
    }

    @GetMapping("/calculadora/multiply")
    public double multiply(@RequestParam("x") double x, @RequestParam("y") double y) {
        return this.service.multiply(x, y);
    }

    @GetMapping("/calculadora/divide")
    public double divide(@RequestParam("x") double x, @RequestParam("y") double y) {
        return this.service.divide(x, y);
    }
}
