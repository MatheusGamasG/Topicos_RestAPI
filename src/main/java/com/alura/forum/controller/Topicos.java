package com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alura.forum.controller.dto.TopicoDTO;
import com.alura.forum.form.TopicoForm;
import com.alura.forum.modelo.Topico;
import com.alura.forum.repository.CursoRepository;
import com.alura.forum.repository.TopicoRepository;

@RestController
@RequestMapping("/topicos")
public class Topicos {

	@Autowired
	private TopicoRepository topicoRepository;
	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public List<TopicoDTO> listaTopicos(String cursoNome) {
		
		if(cursoNome == null) {
			List<Topico> topicos = topicoRepository.findAll();	
			return TopicoDTO.converter(topicos);
		} else {
			List<Topico> topicos = topicoRepository.findByCursoNome(cursoNome);
			return TopicoDTO.converter(topicos);
		}			
		
	}
	
	@PostMapping
	public void cadastrar(@RequestBody TopicoForm form) {
		Topico topico = form.converter(cursoRepository);
		topicoRepository.save(topico);
	}
}
