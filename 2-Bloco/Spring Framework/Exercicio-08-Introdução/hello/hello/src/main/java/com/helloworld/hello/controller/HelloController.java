package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		String titulo = "ATIVIDADE 1\n---------------\n";
		String mentalidades = "Mentalidades:\n1 - Orientação ao Futuro\n2 - Responsabilidade Pessoal\n3 - Mentalidade de crescimento\n4 - Persistência\n---------------\n";
		String habilidades = "Habilidades:\n1 - Trabalho em equipe\n2 - Atenção aos detalhes\n3 - Proatividade\n4 - Comunicação";
		return titulo + mentalidades + habilidades;
	}
}
