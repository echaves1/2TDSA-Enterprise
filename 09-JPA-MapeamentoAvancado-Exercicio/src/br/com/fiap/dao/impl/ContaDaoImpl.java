package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.entity.Conta;
import br.com.fiap.entity.ContaPK;

public class ContaDaoImpl extends GenericDAOImpl<Conta, ContaPK> implements ContaDAO{

	public ContaDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
