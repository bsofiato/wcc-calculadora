package com.matera.wcc.calculadora.service;

import com.matera.wcc.calculadora.domain.Operacao;
import com.matera.wcc.calculadora.domain.Requisicao;
import com.matera.wcc.calculadora.domain.TipoOperacao;
import com.matera.wcc.calculadora.repository.OperacaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.Instant;

@Service
public class CalculadoraService {
    private final OperacaoRepository operacaoRepository;

    public CalculadoraService(OperacaoRepository operacaoRepository) {
        this.operacaoRepository = operacaoRepository;
    }

    private void registrar(TipoOperacao tipoOperacao, BigDecimal x, BigDecimal y, BigDecimal resultado) {
        Operacao operacao = new Operacao();
        operacao.setPrimeiroOperando(x);
        operacao.setSegundoOperando(y);
        operacao.setResultado(resultado);
        operacao.setTipoOperacao(tipoOperacao);

        operacao.setRequisicao(new Requisicao());
        operacao.getRequisicao().setIp("localhost"); // Por enquanto fica assim ;)
        operacao.getRequisicao().setTimestamp(Instant.now());

        this.operacaoRepository.save(operacao);
    }

    @Transactional
    public BigDecimal add(BigDecimal x, BigDecimal y) {
        BigDecimal resultado = x.add(y);

        registrar(TipoOperacao.ADICAO, x, y, resultado);

        return resultado;
    }
    @Transactional
    public BigDecimal subtract(BigDecimal x, BigDecimal y) {
        BigDecimal resultado = x.subtract(y);

        registrar(TipoOperacao.SUBTRACAO, x, y, resultado);

        return resultado;
    }
    @Transactional
    public BigDecimal multiply(BigDecimal x, BigDecimal y) {
        BigDecimal resultado = x. multiply(y);

        registrar(TipoOperacao.MULTIPLICACAO, x, y, resultado);

        return resultado;
    }

    @Transactional
    public BigDecimal divide(BigDecimal x, BigDecimal y) {
        BigDecimal resultado = x.divide(y);

        registrar(TipoOperacao.DIVISAO, x, y, resultado);

        return resultado;
    }
}
