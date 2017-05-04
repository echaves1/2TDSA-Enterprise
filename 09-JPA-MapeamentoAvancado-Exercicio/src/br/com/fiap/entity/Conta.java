package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CONTA")
@IdClass(ContaPK.class)
@Inheritance(strategy=InheritanceType.JOINED)

public class Conta {

	@Id
	@SequenceGenerator(name="seqName", sequenceName="SEQ_TB_CONTA", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqName")
	@Column(name="CD_CODIGO", nullable=false)
	private int codigo;
	
	@Column(name="NR_CONTAA", nullable=false)
	private double numeroConta;
	
	@Column(name="VL_SALDO", nullable=false)
	private double saldo;
	
	@Id
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="NR_AGENCIA")
	private Agencia agencia;

	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conta(int codigo, double numeroConta, double saldo, Agencia agencia) {
		super();
		this.codigo = codigo;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(double numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
	
}
