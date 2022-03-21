package edu.mjv.school.projetofinal.dto;

import java.time.LocalDateTime;
import java.util.List;

import edu.mjv.school.projetofinal.model.ContratoServico;
import edu.mjv.school.projetofinal.model.Endereco;

public class ContratoDto {
	private Integer numeroProtocolo;
	private LocalDateTime dataHora;
	private Endereco enderecoInstalacao;
	private List<ContratoServico> servicos;
	//private Double valorTotal;
	private Integer idCliente;
	public Integer getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(Integer numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Endereco getEnderecoInstalacao() {
		return enderecoInstalacao;
	}
	public void setEnderecoInstalacao(Endereco enderecoInstalacao) {
		this.enderecoInstalacao = enderecoInstalacao;
	}
	public List<ContratoServico> getServicos() {
		return servicos;
	}
	public void setServicos(List<ContratoServico> servicos) {
		this.servicos = servicos;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
}
