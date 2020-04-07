package com.matera.wcc.calculadora.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ResultadoDTO {
    @JsonProperty("primeiro-operando")
    private BigDecimal primeiroOperando;

    @JsonProperty("segundo-operando")
    private BigDecimal segundoOperando;

    @JsonProperty("tipo-operacao")
    private TipoOperacaoDTO tipoOperacao;

    private BigDecimal resultado;

    public BigDecimal getPrimeiroOperando() { return primeiroOperando; }

    public void setPrimeiroOperando(BigDecimal primeiroOperando) { this.primeiroOperando = primeiroOperando; }

    public BigDecimal getSegundoOperando() { return segundoOperando; }

    public void setSegundoOperando(BigDecimal segundoOperando) { this.segundoOperando = segundoOperando; }

    public BigDecimal getResultado() { return resultado; }

    public void setResultado(BigDecimal resultado) { this.resultado = resultado; }

    public TipoOperacaoDTO getTipoOperacao() { return tipoOperacao; }

    public void setTipoOperacao(TipoOperacaoDTO tipoOperacao) { this.tipoOperacao = tipoOperacao; }
}
