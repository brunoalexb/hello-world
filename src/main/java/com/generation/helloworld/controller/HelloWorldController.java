package com.generation.helloworld.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm") 
	public String getBSMs() {
		return "Mentalidade de Crescimento, Orientação ao Futuro, Persistência, Atenção aos Detalhes, Proatividade e Comunicação";
		
	}
	
	@GetMapping("/objetivos")
	
	public List<String> getObjetivos() {
		return List.of(
				"Aprofundar o conhecimento em Spring Boot",
                "Praticar a criação de APIs RESTful",
                "Entender a integração com bancos de dados"
		);
		
	}
}
