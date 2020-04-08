package com.matera.wcc.calculadora.domain;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.annotation.Generated;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="OPERACAO")
public class Operacao {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Type(type="uuid-char")
    private UUID id;

    @Column(name = "PRIMEIRO_OPERANDO")
    private BigDecimal primeiroOperando;

    @Column(name = "SEGUNDO_OPERANDO")
    private BigDecimal segundoOperando;

    @Column(name = "RESULTADO")
    private BigDecimal resultado;

    @Column(name = "TIPO_OPERACAO")
    @Enumerated(EnumType.STRING)
    private TipoOperacao tipoOperacao;

    @Embedded
    private Requisicao requisicao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getPrimeiroOperando() {
        return primeiroOperando;
    }

    public void setPrimeiroOperando(BigDecimal primeiroOperando) {
        this.primeiroOperando = primeiroOperando;
    }

    public BigDecimal getSegundoOperando() {
        return segundoOperando;
    }

    public void setSegundoOperando(BigDecimal segundoOperando) {
        this.segundoOperando = segundoOperando;
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Requisicao getRequisicao() {
        return requisicao;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }
}
