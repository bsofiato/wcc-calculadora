package com.matera.wcc.calculadora.rest;

import com.matera.wcc.calculadora.rest.dto.ResultadoDTO;
import com.matera.wcc.calculadora.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
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

    private ResultadoDTO resultado(BigDecimal x, BigDecimal y, BigDecimal resultado) {
        ResultadoDTO dto = new ResultadoDTO();
        dto.setPrimeiroOperando(x);
        dto.setSegundoOperando(y);
        dto.setResultado(resultado);
        return dto;
    }

    @GetMapping("/calculadora/add")
    public ResultadoDTO add(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return resultado(x, y, this.service.add(x, y));
    }

    @GetMapping("/calculadora/subtract")
    public ResultadoDTO subtract(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return resultado(x, y, this.service.subtract(x, y));
    }

    @GetMapping("/calculadora/multiply")
    public ResultadoDTO multiply(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return resultado(x, y, this.service.multiply(x, y));
    }

    @GetMapping("/calculadora/divide")
    public ResultadoDTO divide(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return resultado(x, y, this.service.divide(x, y));
    }
}
