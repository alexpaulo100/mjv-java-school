package edu.mjv.school.projetofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mjv.school.projetofinal.model.Cadastro;
import edu.mjv.school.projetofinal.repository.CadastroRepository;
import edu.mjv.school.projetofinal.repository.ProfissaoRepository;

@Service
public class CadastroService {
	@Autowired
	private CadastroRepository repository;
	
	@Autowired
	private ProfissaoRepository profissaoRepository;
	public void salvar(Cadastro cadastro) {
		boolean vai = profissaoRepository.existsById(cadastro.getProfissao().getId());
		if(vai)
			repository.save(cadastro);
		else
			System.out.println("Não foi possivel salvar o cadastro com esta profissao");
	}
}
