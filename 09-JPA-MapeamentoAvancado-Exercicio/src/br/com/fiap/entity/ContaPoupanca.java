package br.com.fiap.entity;
import javax.persistence.*;

@Entity
@Table(name="TB_CONTA_POUPAN�A")
public class ContaPoupanca extends Conta{

	@Column(name="VL_REMDIMENTO", nullable=false)
	private double rendimento;
	
}
