package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AgenciaDAO;
import br.com.fiap.entity.Agencia;

public class AgenciaDaoImpl extends GenericDAOImpl<Agencia, Integer> implements AgenciaDAO{

	public AgenciaDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
