package com.kdev.cursomvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdev.cursomvc.entity.Pedido;
import com.kdev.cursomvc.repository.PedidoRepository;
import com.kdev.cursomvc.service.exception.ObjectNotFoundException;


@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;

	public Pedido buscarPorId(Long id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado: " + id + ", tipo: " + Pedido.class.getName()));
	}
}
