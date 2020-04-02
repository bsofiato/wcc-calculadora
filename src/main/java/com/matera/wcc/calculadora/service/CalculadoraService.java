package com.matera.wcc.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public int add(int x, int y) {
        return x + y;
    }
}
