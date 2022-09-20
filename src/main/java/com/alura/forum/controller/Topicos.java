package com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.modelo.Curso;
import com.alura.forum.modelo.Topico;

@RestController
public class Topicos {

	@GetMapping("/topicos")
	public List<Topico> listaTopicos() {
		Topico topico = new Topico("Não consigo rodar o projeto", "Dá erro 404 not found", new Curso("Springboot para leigos", "Programação"));
		
		return Arrays.asList(topico, topico, topico);
	}
}