package com.kdev.cursomvc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kdev.cursomvc.entity.Categoria;
import com.kdev.cursomvc.repository.CategoriaRepository;
import com.kdev.cursomvc.service.exception.ObjectNotFoundException;


@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;

	public Categoria buscarPorId(Long id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado: " + id + ", tipo: " + Categoria.class.getName()));
	}
}
