package com.matera.wcc.calculadora.repository;

import com.matera.wcc.calculadora.domain.Operacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, UUID> {

}
