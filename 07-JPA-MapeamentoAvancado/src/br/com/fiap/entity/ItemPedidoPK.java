package br.com.fiap.entity;

import java.io.Serializable;
/**
 * Classe que armazena as chaves primarias da entidade
 */

public class ItemPedidoPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int produto;
	private int pedido;
	
	public ItemPedidoPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemPedidoPK(int produto, int pedido) {
		super();
		this.produto = produto;
		this.pedido = pedido;
	}
	public int getProduto() {
		return produto;
	}
	public void setProduto(int produto) {
		this.produto = produto;
	}
	public int getPedido() {
		return pedido;
	}
	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	
	

	
	
	
}
