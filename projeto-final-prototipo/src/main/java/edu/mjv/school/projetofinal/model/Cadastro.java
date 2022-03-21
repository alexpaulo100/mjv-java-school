package edu.mjv.school.projetofinal.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "tab_cadastro")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@ElementCollection
	@JoinColumn(name = "id_cadastro")
	private List<String> emails;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_cadastro")
	private List<Telefone> telefones;
	
	@Embedded
	private CadastroLog log; //como salvar o log automaticamente?
	
	@Embedded
	private Endereco endereco;
	
	@ManyToOne
	private Profissao profissao;
	
	public Profissao getProfissao() {
		return profissao;
	}
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public CadastroLog getLog() {
		return log;
	}
	public void setLog(CadastroLog log) {
		this.log = log;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	@Override
	public String toString() {
		return "Cadastro [id=" + id + ", nome=" + nome + "]";
	}
	@PrePersist
	//@PreUpdate
	private void logarInclusao() {
		log = new CadastroLog();
		log.setDataHoraInclusao(LocalDateTime.now());
	}
}
