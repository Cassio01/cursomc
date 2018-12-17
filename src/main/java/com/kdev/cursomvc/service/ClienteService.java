package com.kdev.cursomvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdev.cursomvc.entity.Cliente;
import com.kdev.cursomvc.repository.ClienteRepository;
import com.kdev.cursomvc.service.exception.ObjectNotFoundException;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public Cliente buscarPorId(Long id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado: " + id + ", tipo: " + Cliente.class.getName()));
	}
}
