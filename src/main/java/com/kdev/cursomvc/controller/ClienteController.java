package com.kdev.cursomvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdev.cursomvc.entity.Cliente;
import com.kdev.cursomvc.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@Autowired
	private ClienteService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Long id) {
		Cliente cat = service.buscarPorId(id);
		return ResponseEntity.ok(cat);
	}

//	@GetMapping
//	public List<Cliente> lista() {
//		Cliente cat1 = new Cliente(1l, "Informática");
//		Cliente cat2 = new Cliente(2l, "Escritório");
//		
//		List<Cliente> lista = new ArrayList<>();
//		lista.add(cat1);
//		lista.add(cat2);
//			
//		return lista;
//	}
}
