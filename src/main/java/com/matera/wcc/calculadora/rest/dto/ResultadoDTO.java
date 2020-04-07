package com.matera.wcc.calculadora.rest.dto;

import java.math.BigDecimal;

public class ResultadoDTO {
    private BigDecimal primeiroOperando;
    private BigDecimal segundoOperando;
    private BigDecimal resultado;

    public BigDecimal getPrimeiroOperando() { return primeiroOperando; }

    public void setPrimeiroOperando(BigDecimal primeiroOperando) { this.primeiroOperando = primeiroOperando; }

    public BigDecimal getSegundoOperando() { return segundoOperando; }

    public void setSegundoOperando(BigDecimal segundoOperando) { this.segundoOperando = segundoOperando; }

    public BigDecimal getResultado() { return resultado; }

    public void setResultado(BigDecimal resultado) { this.resultado = resultado; }
}
