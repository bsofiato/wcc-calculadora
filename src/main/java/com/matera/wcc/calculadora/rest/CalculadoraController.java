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

    @GetMapping("/calculadora")
    public int add(@RequestParam("x") int x, @RequestParam("y") int y) {
        return this.service.add(x, y);
    }
}
