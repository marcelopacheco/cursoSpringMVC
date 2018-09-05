package com.algaworks.cobranca.repository;

import com.algaworks.cobranca.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Titulos extends JpaRepository<Titulo, Long> {

    public List<Titulo> findByDescricaoContaining(String descricao);
}
