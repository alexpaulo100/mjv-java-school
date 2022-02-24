package com.mjvschool.atracao.app;

import java.util.Date;
import java.util.List;

import com.mjvschool.atracao.model.cadastro.Cadastro;
import com.mjvschool.atracao.model.cadastro.Endereco;
import com.mjvschool.atracao.model.cadastro.Pais;
import com.mjvschool.atracao.model.cadastro.Pessoa;
import com.mjvschool.atracao.model.cadastro.Servico;
import com.mjvschool.atracao.model.contrato.Contrato;
import com.mjvschool.atracao.output.GeradorArquivo;
import com.mjvschool.atracao.repository.ContratoRepository;

public class AguaLuzAtracaoApp {
	private static ContratoRepository contratoRepositorio = new ContratoRepository();
	public static void main(String[] args) {
		faseAtracao();
		faseGeracaoArquivo();
	}
	private static void faseGeracaoArquivo() {
		List<Contrato> contratos =  contratoRepositorio.listarTodos();
		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivoCsv(contratos);
		gerador.gerarArquivoTxt(contratos);
		
	}
	private static void faseAtracao() {
		Contrato contrato = new Contrato();
        contrato.setNumeroProtocolo(123);
        contrato.setServico(Servico.LUZ);
        Cadastro cadastro = new Cadastro();
        cadastro.setAtivo(true);
        cadastro.setNumero(27);

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("56737284094");
        pessoa.setNome("Gleyson Sampaio de Oliveira");
        pessoa.setRg("898797");
        pessoa.setCelular("98965498760");
        pessoa.setPais(Pais.BRASIL);

        Endereco endereco = new Endereco();
        endereco.setBairro("Santo Antonio");
        endereco.setCep("27.310-657");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setLogradouro("Rua das Marias");
        endereco.setNumero("243");
        endereco.setComplemento("Próximo ao quebra molas");
        pessoa.setEndereco(endereco);
        cadastro.setPessoa(pessoa);
        contrato.setCadastro(cadastro);
        contrato.setDataHora(new Date());

        contratoRepositorio.gravar(contrato);

        Contrato contrato2 = new Contrato();
        contrato2.setNumeroProtocolo(78974);
        contrato2.setServico(Servico.AGUA);
        Cadastro cadastro2 = new Cadastro();
        cadastro2.setAtivo(true);
        cadastro2.setNumero(27);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCpf("8787987554");
        pessoa2.setNome("Ray Brandão de Miranda");
        pessoa2.setRg("9878974");
        pessoa2.setCelular("98785468");
        pessoa2.setPais(Pais.ESTADOS_UNIDOS);

        Endereco endereco2 = new Endereco();
        endereco2.setBairro("Santo Antonio");
        endereco2.setCep("27.310-657");
        endereco2.setCidade("São Paulo");
        endereco2.setEstado("SP");
        endereco2.setLogradouro("Rua das Marias");
        endereco2.setNumero("243");
        endereco2.setComplemento("");
        pessoa2.setEndereco(endereco2);
        cadastro2.setPessoa(pessoa2);
        contrato2.setCadastro(cadastro2);
        contrato2.setDataHora(new Date());

        contratoRepositorio.gravar(contrato2);
	}
}
