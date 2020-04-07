package com.matera.wcc.calculadora.rest;

import com.matera.wcc.calculadora.rest.dto.RequisicaoDTO;
import com.matera.wcc.calculadora.rest.dto.ResultadoDTO;
import com.matera.wcc.calculadora.rest.dto.TipoOperacaoDTO;
import com.matera.wcc.calculadora.service.CalculadoraService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

import static com.matera.wcc.calculadora.rest.dto.TipoOperacaoDTO.*;

@RestController
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    private ResultadoDTO resultado(BigDecimal x, BigDecimal y, TipoOperacaoDTO tipoOperacao, BigDecimal resultado) {
        ResultadoDTO dto = new ResultadoDTO();
        dto.setPrimeiroOperando(x);
        dto.setSegundoOperando(y);
        dto.setTipoOperacao(tipoOperacao);
        dto.setResultado(resultado);
        return dto;
    }

    @GetMapping("/calculadora/add")
    public ResultadoDTO add(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return resultado(x, y, ADICAO, this.service.add(x, y));
    }

    @GetMapping("/calculadora/subtract")
    public ResultadoDTO subtract(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return resultado(x, y, SUBTRACAO, this.service.subtract(x, y));
    }

    @GetMapping("/calculadora/multiply")
    public ResultadoDTO multiply(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return resultado(x, y, MULTIPLICACAO, this.service.multiply(x, y));
    }

    @GetMapping("/calculadora/divide")
    public ResultadoDTO divide(@RequestParam("x") BigDecimal x, @RequestParam("y") BigDecimal y) {
        return resultado(x, y, DIVISAO, this.service.divide(x, y));
    }

    @PostMapping("/calculadora")
    public ResultadoDTO calculate(@RequestBody RequisicaoDTO requisicaoDTO) {
        BigDecimal x = requisicaoDTO.getPrimeiroOperando();
        BigDecimal y = requisicaoDTO.getSegundoOperando();
        switch(requisicaoDTO.getTipoOperacao()) {
            case ADICAO :  return resultado(x, y, ADICAO, this.service.add(x, y));
            case SUBTRACAO:  return resultado(x, y, SUBTRACAO, this.service.subtract(x, y));
            case MULTIPLICACAO:  return resultado(x, y, MULTIPLICACAO, this.service.multiply(x, y));
            case DIVISAO:  return resultado(x, y, DIVISAO, this.service.divide(x, y));
            default: throw new IllegalArgumentException("Tipo de operacao inexistente");
        }
    }
}
