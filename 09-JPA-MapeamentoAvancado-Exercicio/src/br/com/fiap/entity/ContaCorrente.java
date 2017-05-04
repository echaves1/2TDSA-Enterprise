package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name="TB_CONTA_CORRENTE")
public class ContaCorrente extends Conta{
	
	
	@Column(name="VL_TARIFA", nullable=false)
	private double tarifa;
	
	@Column(name="VL_CHEQUE_ESPECIAL", nullable=false)
	private double chequeEspecial;

	
	
	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int codigo, double numeroConta, double saldo, Agencia agencia) {
		super(codigo, numeroConta, saldo, agencia);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(double tarifa, double chequeEspecial) {
		super();
		this.tarifa = tarifa;
		this.chequeEspecial = chequeEspecial;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
}
