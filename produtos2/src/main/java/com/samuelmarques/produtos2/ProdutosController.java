package com.samuelmarques.produtos2;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/produtos2")
public class ProdutosController {
	@GetMapping
	
	public String listarProdutos() {
		return "lista de produtos";
	}
	
}
