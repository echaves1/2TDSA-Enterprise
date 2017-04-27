package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@IdClass(DependentePK.class)
@Table(name="T_DEPENDENTE")

public class Dependente {

	@Id
	@SequenceGenerator(name="seqDependente", sequenceName="SEQ_DEPENDENTE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqDependente")
	@Column(name="CD_CODIGO")
	private int codigo;

	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CD_FUNCIONARIO")
	private Funcionario funcionario;
	
	@Column(name="NM_NOME")
	private String nome;

	public Dependente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dependente(Funcionario funcionario, String nome) {
		super();
		this.funcionario = funcionario;
		this.nome = nome;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
	
	
	
}
