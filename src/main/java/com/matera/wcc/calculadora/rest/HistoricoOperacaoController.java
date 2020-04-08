package com.matera.wcc.calculadora.rest;

import com.matera.wcc.calculadora.domain.Operacao;
import com.matera.wcc.calculadora.rest.dto.HistoricoOperacaoDTO;
import com.matera.wcc.calculadora.rest.dto.TipoOperacaoDTO;
import com.matera.wcc.calculadora.service.HistoricoOperacaoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HistoricoOperacaoController {
    private final HistoricoOperacaoService service;

    private HistoricoOperacaoDTO convert(Operacao operacao) {
        HistoricoOperacaoDTO historicoOperacaoDTO = new HistoricoOperacaoDTO();
        historicoOperacaoDTO.setId(operacao.getId());
        historicoOperacaoDTO.setPrimeiroOperando(operacao.getPrimeiroOperando());
        historicoOperacaoDTO.setSegundoOperando(operacao.getSegundoOperando());
        historicoOperacaoDTO.setTipoOperacao(TipoOperacaoDTO.valueOf(operacao.getTipoOperacao().name()));
        historicoOperacaoDTO.setResultado(operacao.getResultado());

        historicoOperacaoDTO.setTimestamp(operacao.getRequisicao().getTimestamp());
        historicoOperacaoDTO.setIp(operacao.getRequisicao().getIp());

        return historicoOperacaoDTO;
    }

    public HistoricoOperacaoController(HistoricoOperacaoService service) {
        this.service = service;
    }

    @GetMapping("/historico-operacoes")
    public List<HistoricoOperacaoDTO> fetchAll() {
        List <HistoricoOperacaoDTO> operacoes = new ArrayList<>();
        for (Operacao operacao : this.service.findAll()) {
            operacoes.add(convert(operacao));
        }
        return operacoes;
    }
}
