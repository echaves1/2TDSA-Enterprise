package br.com.fiap.entity;

import java.io.Serializable;

public class ContaPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private int agencia;
	private int codigo;
	
	
	
	public ContaPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContaPK(int agencia, int codigo) {
		super();
		this.agencia = agencia;
		this.codigo = codigo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
