package br.com.fiap.entity;

import java.io.Serializable;

public class DependentePK implements Serializable{

	/**
	 * 
	 */

	private int funcionario;
	private int codigo;
	

	public DependentePK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DependentePK(int funcionario, int codigo) {
		super();
		this.funcionario = funcionario;
		this.codigo = codigo;
	}



	public int getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(int funcionario) {
		this.funcionario = funcionario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

}
