package com.matera.wcc.calculadora.service;

import com.matera.wcc.calculadora.domain.Operacao;
import com.matera.wcc.calculadora.repository.OperacaoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HistoricoOperacaoService {
    private final OperacaoRepository operacaoRepository;

    public HistoricoOperacaoService(OperacaoRepository operacaoRepository) {
        this.operacaoRepository = operacaoRepository;
    }

    @Transactional
    public List<Operacao> findAll() {
        return this.operacaoRepository.findAll();
    }
}
