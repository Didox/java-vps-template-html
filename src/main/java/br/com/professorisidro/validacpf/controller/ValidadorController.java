package br.com.professorisidro.validacpf.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ValidadorController {
	@GetMapping("/")
	public String index() {
		return "<h1>teste</h1> teste danilo teste";
	}
}
