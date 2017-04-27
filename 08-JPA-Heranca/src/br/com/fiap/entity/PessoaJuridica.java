package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_PJURIDICA")
public class PessoaJuridica extends Pessoa{

	@Column(name="NR_CNPJ")
	private int cnpj;
	
	@Column(name="NM_FANTASIA")
	private String nomeFantasia;

	
	public PessoaJuridica(String nome, String endereco, int cnpj, String nomeFantasia) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String nome, String endereco) {
		super(nome, endereco);
		// TODO Auto-generated constructor stub
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	
	
}
