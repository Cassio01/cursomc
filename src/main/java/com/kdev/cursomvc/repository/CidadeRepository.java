package com.kdev.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdev.cursomvc.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
