package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PESSOA")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@SequenceGenerator(name="seqPessoa", sequenceName="SEQ_PESSOA", allocationSize=1)
public class Pessoa {
	
	@Id
	@Column(name="CD_CODIGO", nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqPessoa")
	private int codigo;
	
	@Column(name="NM_NOME")
	private String nome;
	
	@Column(name="DS_ENDERECO")
	private String endereco;
	


	public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
