package com.kdev.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdev.cursomvc.entity.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
