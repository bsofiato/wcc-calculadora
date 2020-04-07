package com.matera.wcc.calculadora.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class RequisicaoDTO {
    @JsonProperty("primeiro-operando")
    private BigDecimal primeiroOperando;

    @JsonProperty("segundo-operando")
    private BigDecimal segundoOperando;

    @JsonProperty("tipo-operacao")
    private String tipoOperacao;

    public BigDecimal getPrimeiroOperando() { return primeiroOperando; }
    public void setPrimeiroOperando(BigDecimal primeiroOperando) { this.primeiroOperando = primeiroOperando; }
    public BigDecimal getSegundoOperando() { return segundoOperando; }
    public void setSegundoOperando(BigDecimal segundoOperando) { this.segundoOperando = segundoOperando; }
    public String getTipoOperacao() { return tipoOperacao; }
    public void setTipoOperacao(String tipoOperacao) { this.tipoOperacao = tipoOperacao; }
}

