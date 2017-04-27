package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqPedido", sequenceName="SEQ_PEDIDO", allocationSize=1)

public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqPedido")
	@Column(name="CD_CODIGO")
	private int codigo;
	

	@Column(nullable=false, name="DT_PEDIDO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataPedido;
	
	@Column(nullable=false, name="DT_ENTREGA")
	@Temporal(TemporalType.DATE)
	private Calendar dataEntrega;

	@Column(nullable=false, name="NM_CLIENTE")
	private String cliente;
	
	
	public Pedido(int codigo, Calendar dataPedido, Calendar dataEntrega, String cliente) {
		super();
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.cliente = cliente;
	}
	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Calendar getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Calendar getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
}
