package com.matera.wcc.calculadora.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/calculadora")
    public int add(@RequestParam("x") int x, @RequestParam("y") int y) {
        return x + y;
    }
}
