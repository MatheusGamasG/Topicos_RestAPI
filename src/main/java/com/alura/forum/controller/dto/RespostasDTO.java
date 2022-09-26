package com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import com.alura.forum.modelo.Resposta;

public class RespostasDTO {
	
	private Long id;
	private String mensagem;
	private LocalDateTime data;
	private String nomeAutor;
	
	public RespostasDTO(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.data = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}
}
