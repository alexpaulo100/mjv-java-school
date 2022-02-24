package com.mjvschool.notificacao.repository;

import java.util.ArrayList;
import java.util.List;

import com.mjvschool.notificacao.model.dto.DadosArquivoDTO;

public class DadosArquivoRepository {
	private List <DadosArquivoDTO> dados = new ArrayList<DadosArquivoDTO>();
	public void gravar(DadosArquivoDTO dadosArquivoDTO) {
		dados.add(dadosArquivoDTO);
	}
	public List <DadosArquivoDTO> listarTodos(){
		return dados;
	}
}
