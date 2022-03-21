package edu.mjv.school.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.mjv.school.projetofinal.dto.ContratoDto;
import edu.mjv.school.projetofinal.model.Cadastro;
import edu.mjv.school.projetofinal.model.Contrato;
import edu.mjv.school.projetofinal.service.ContratoService;

@RestController
@RequestMapping("/contratos")
public class ContratoController {
	@Autowired
	private ContratoService service;
	@PostMapping
	public void gravar(@RequestBody ContratoDto dto) {
		System.out.println("Gravando registro");
		System.out.println(dto);
		service.salvar(dto);
	}
}
