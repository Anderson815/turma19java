package com.helloworld2.hello2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello2Controller {
	
	@GetMapping
	public String hello2() {
		String titulo = "ATIVIDADE 2\n---------------\n";
		String objetivos = "Objetivos:\n1 - Definir banco de dados do projeto\n2 - documentar a estrutura do banco de dadso do projeto\n3 - Introdução ao Spring Framework\n4 - Comunicação do back-end com o db através do JPA";
		return titulo + objetivos;
	}
}