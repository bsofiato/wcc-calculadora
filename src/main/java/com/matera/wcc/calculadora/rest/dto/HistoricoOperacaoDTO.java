package com.matera.wcc.calculadora.rest.dto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class HistoricoOperacaoDTO {
    private UUID id;
    private BigDecimal primeiroOperando;
    private BigDecimal segundoOperando;
    private BigDecimal resultado;
    private TipoOperacaoDTO tipoOperacao;
    private Instant timestamp;
    private String ip;

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public BigDecimal getPrimeiroOperando() { return primeiroOperando; }
    public void setPrimeiroOperando(BigDecimal primeiroOperando) { this.primeiroOperando = primeiroOperando; }
    public BigDecimal getSegundoOperando() { return segundoOperando; }
    public void setSegundoOperando(BigDecimal segundoOperando) { this.segundoOperando = segundoOperando; }
    public BigDecimal getResultado() { return resultado; }
    public void setResultado(BigDecimal resultado) { this.resultado = resultado; }
    public TipoOperacaoDTO getTipoOperacao() { return tipoOperacao; }
    public void setTipoOperacao(TipoOperacaoDTO tipoOperacao) { this.tipoOperacao = tipoOperacao; }
    public Instant getTimestamp() { return timestamp; }
    public void setTimestamp(Instant timestamp) { this.timestamp = timestamp; }
    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }
}
