package edu.mjv.school.projetofinal.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mjv.school.projetofinal.dto.ContratoDto;
import edu.mjv.school.projetofinal.model.Cadastro;
import edu.mjv.school.projetofinal.model.Contrato;
import edu.mjv.school.projetofinal.model.ContratoServico;
import edu.mjv.school.projetofinal.repository.CadastroRepository;
import edu.mjv.school.projetofinal.repository.ContratoRepository;

@Service
public class ContratoService {
	@Autowired
	private ContratoRepository repository;
	
	@Autowired
	private CadastroRepository cadastroRepository;
	public void salvar(ContratoDto dto) {
		
		ModelMapper mapper =  new ModelMapper();
		/*
		Contrato contrato = new Contrato();
		contrato.setDataHora(dto.getDataHora());
		*/
		
		Cadastro cadastro = cadastroRepository.findById(dto.getIdCliente()).orElse(null);
		if(cadastro!=null) {
			Contrato contrato = mapper.map(dto, Contrato.class);
			contrato.setCadastro(cadastro);
			Double total = 0.0;
			for(ContratoServico s: dto.getServicos()) {
				total = total + s.getValor();
			}
			contrato.setValorTotal(total);
			repository.save(contrato);
		}else {
			System.out.println("Não foi possivel salvar o contrato, cliente não existe");
		}
		
	}
}
