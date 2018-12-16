package com.kdev.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdev.cursomvc.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
