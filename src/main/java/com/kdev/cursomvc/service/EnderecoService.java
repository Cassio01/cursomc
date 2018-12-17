package com.kdev.cursomvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdev.cursomvc.entity.Endereco;
import com.kdev.cursomvc.repository.EnderecoRepository;
import com.kdev.cursomvc.service.exception.ObjectNotFoundException;


@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repository;

	public Endereco buscarPorId(Long id) {
		Optional<Endereco> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado: " + id + ", tipo: " + Endereco.class.getName()));
	}
}
