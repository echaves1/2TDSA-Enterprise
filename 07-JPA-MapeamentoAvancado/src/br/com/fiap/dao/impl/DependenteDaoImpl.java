package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.DependentePK;

public class DependenteDaoImpl extends GenericDAOImpl<Dependente, DependentePK> implements DependenteDAO{

	public DependenteDaoImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
