package com.kdev.cursomvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kdev.cursomvc.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
