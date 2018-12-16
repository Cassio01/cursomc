package com.kdev.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdev.cursomvc.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
