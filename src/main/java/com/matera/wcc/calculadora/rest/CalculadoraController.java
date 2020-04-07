package com.matera.wcc.calculadora.rest;

import com.matera.wcc.calculadora.service.CalculadoraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @GetMapping("/calculadora/add")
    public BigDecimal add(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return this.service.add(x, y);
    }

    @GetMapping("/calculadora/subtract")
    public BigDecimal subtract(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return this.service.subtract(x, y);
    }

    @GetMapping("/calculadora/multiply")
    public BigDecimal multiply(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return this.service.multiply(x, y);
    }

    @GetMapping("/calculadora/divide")
    public BigDecimal divide(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return this.service.divide(x, y);
    }
}
