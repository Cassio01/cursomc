package com.kdev.cursomvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kdev.cursomvc.entity.Pedido;
import com.kdev.cursomvc.service.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Long id) {
		Pedido cat = service.buscarPorId(id);
		return ResponseEntity.ok(cat);
	}

//	@GetMapping
//	public List<Pedido> lista() {
//		Pedido cat1 = new Pedido(1l, "Informática");
//		Pedido cat2 = new Pedido(2l, "Escritório");
//		
//		List<Pedido> lista = new ArrayList<>();
//		lista.add(cat1);
//		lista.add(cat2);
//			
//		return lista;
//	}
}
