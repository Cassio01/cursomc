package com.kdev.cursomvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdev.cursomvc.entity.Endereco;
import com.kdev.cursomvc.service.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Long id) {
		Endereco cat = service.buscarPorId(id);
		return ResponseEntity.ok(cat);
	}

//	@GetMapping
//	public List<Endereco> lista() {
//		Endereco cat1 = new Endereco(1l, "Informática");
//		Endereco cat2 = new Endereco(2l, "Escritório");
//		
//		List<Endereco> lista = new ArrayList<>();
//		lista.add(cat1);
//		lista.add(cat2);
//			
//		return lista;
//	}
}
