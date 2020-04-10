package com.matera.wcc.calculadora.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class RequisicaoDTO {
    @JsonProperty("primeiro-operando")
    @NotNull
    private BigDecimal primeiroOperando;

    @JsonProperty("segundo-operando")
    @NotNull
    private BigDecimal segundoOperando;

    @JsonProperty("tipo-operacao")
    @NotNull
    private TipoOperacaoDTO tipoOperacao;

    public BigDecimal getPrimeiroOperando() { return primeiroOperando; }
    public void setPrimeiroOperando(BigDecimal primeiroOperando) { this.primeiroOperando = primeiroOperando; }
    public BigDecimal getSegundoOperando() { return segundoOperando; }
    public void setSegundoOperando(BigDecimal segundoOperando) { this.segundoOperando = segundoOperando; }
    public TipoOperacaoDTO getTipoOperacao() { return tipoOperacao; }
    public void setTipoOperacao(TipoOperacaoDTO tipoOperacao) { this.tipoOperacao = tipoOperacao; }

    @Override
    public String toString() {
        return "RequisicaoDTO{" +
                "primeiroOperando=" + primeiroOperando +
                ", segundoOperando=" + segundoOperando +
                ", tipoOperacao=" + tipoOperacao +
                '}';
    }
}

