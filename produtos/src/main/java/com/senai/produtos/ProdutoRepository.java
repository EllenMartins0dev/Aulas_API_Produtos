package com.senai.produtos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.parser.Part;

import java.util.List;

public interface ProdutoRepository  extends JpaRepository<Produto, Integer> {

    List<Produto> findByNomeContainingIgnoreCase(String nome);
    List<Produto> findByDescricaoContainingIgnoreCase(String descricao);
    List<Produto> findByCategoriaContainingIgnoreCase(String categoria);
    List<Produto> findByCondicaoContainingIgnoreCase(String condicao);

}
