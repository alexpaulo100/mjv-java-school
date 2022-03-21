package edu.mjv.school.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.mjv.school.projetofinal.model.Cadastro;
import edu.mjv.school.projetofinal.service.CadastroService;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
	@Autowired
	private CadastroService service;
	@PostMapping
	public void gravar(@RequestBody Cadastro cadastro) {
		System.out.println("Gravando registro");
		System.out.println(cadastro);
		service.salvar(cadastro);
	}
	@PutMapping()
	public void alterar(@RequestBody Cadastro cadastro) {
		System.out.println("Alterando registro");
		System.out.println(cadastro);
		//repository.save(cadastro);
	}
	@GetMapping(value = "/{id}")
	public void buscar(@PathVariable("id") Integer id) {
		System.out.println("Buscando registro");
		System.out.println("Id:" + id);
	}
	@GetMapping()
	public List<Cadastro> listarTodos() {
		System.out.println("Listando dados");
		return null;
	}
	
	
	@DeleteMapping(value = "/{id}")
	public void excluir(@PathVariable("id") Integer id) {
		System.out.println("Excluindo registro");
		System.out.println("Id:" + id);
	}
	@GetMapping("/filtro")
	public List<Cadastro> filtrar(@RequestParam("nm") String nome){
		System.out.println("Listando cadastros pelo nome " + nome);
		return null;
	}
	
}
