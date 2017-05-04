package br.com.fiap.entity;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="TB_AGENCIA")
@SequenceGenerator(name="seqAgencia", sequenceName="SEQ_TB_AGENCIA", allocationSize=1)
public class Agencia {

	@Id
	@Column(name="CD_CODIGO",nullable=false)
	@GeneratedValue(generator="seqAgencia", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="NR_AGENCIA", nullable=false)
	private double numeroAgencia;
	
	@Column(name="DS_ENDERECO")
	private String endereco;

	@OneToMany(mappedBy="agencia", cascade=CascadeType.PERSIST)
	private List<Conta> conta;
	
	
	public Agencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agencia(int codigo, double numeroAgencia, String endereco) {
		super();
		this.codigo = codigo;
		this.numeroAgencia = numeroAgencia;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(double numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
