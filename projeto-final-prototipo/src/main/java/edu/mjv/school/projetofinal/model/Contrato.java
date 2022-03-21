package edu.mjv.school.projetofinal.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tab_contrato")
public class Contrato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "num_protocolo")
	private Integer numeroProtocolo;
	
	@Column(name = "dh_contrato")
	private LocalDateTime dataHora;
	
	@ManyToOne
	@JoinColumn(name = "id_cadastro")
	private Cadastro cadastro;
	
	@Embedded
	private Endereco enderecoInstalacao;
	
	@OneToMany (cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_contrato")
	private List<ContratoServico> servicos;
	
	@Column(name = "vl_total")
	private Double valorTotal;
	
	public Integer getId() {
		return id;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public Integer getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(Integer numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	public List<ContratoServico> getServicos() {
		return servicos;
	}
	public void setServicos(List<ContratoServico> servicos) {
		this.servicos = servicos;
	}
	public Endereco getEnderecoInstalacao() {
		return enderecoInstalacao;
	}
	public void setEnderecoInstalacao(Endereco enderecoInstalacao) {
		this.enderecoInstalacao = enderecoInstalacao;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
