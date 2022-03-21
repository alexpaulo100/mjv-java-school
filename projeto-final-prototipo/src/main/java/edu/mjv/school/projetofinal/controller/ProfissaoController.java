package edu.mjv.school.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mjv.school.projetofinal.model.Profissao;
import edu.mjv.school.projetofinal.repository.ProfissaoRepository;

@RestController
@RequestMapping("/profissoes")
public class ProfissaoController {
	@Autowired
	private ProfissaoRepository repository;
	@PostMapping
	public void gravar(@RequestBody Profissao cadastro) {
		System.out.println("Gravando registro");
		System.out.println(cadastro);
		repository.save(cadastro);
	}
	
	
}
