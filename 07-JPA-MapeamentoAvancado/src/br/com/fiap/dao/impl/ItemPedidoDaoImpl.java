package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemPedidoDAO;
import br.com.fiap.entity.ItemPedido;
import br.com.fiap.entity.ItemPedidoPK;

public class ItemPedidoDaoImpl extends GenericDAOImpl<ItemPedido, ItemPedidoPK> implements ItemPedidoDAO{

	public ItemPedidoDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
