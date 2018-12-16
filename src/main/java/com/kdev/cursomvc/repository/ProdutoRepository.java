package com.kdev.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdev.cursomvc.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
