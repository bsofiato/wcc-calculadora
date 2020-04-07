package com.matera.wcc.calculadora.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculadoraService {
    public BigDecimal add(BigDecimal x, BigDecimal y) {
        return x.add(y);
    }
    public BigDecimal subtract(BigDecimal x, BigDecimal y) {
        return x.subtract(y);
    }
    public BigDecimal multiply(BigDecimal x, BigDecimal y) {
        return x.multiply(y);
    }
    public BigDecimal divide(BigDecimal x, BigDecimal y) {
        return x.divide(y);
    }

}
