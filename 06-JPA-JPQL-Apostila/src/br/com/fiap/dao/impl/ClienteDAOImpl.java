package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> buscarPorEstado(String estado) {
		TypedQuery<Cliente> query = 
			em.createQuery("from Cliente c where "
			+ "c.endereco.cidade.uf = :es",Cliente.class);
	
		query.setParameter("es", estado);
		
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorDiasReserva(int dias) {
		TypedQuery<Cliente> query = em.createQuery(
			"select r.cliente from Reserva r where "
			+ "r.numeroDias = :n",Cliente.class);
		
		query.setParameter("n", dias);
		
		query.setMaxResults(50); //Máximo de 50 linhas
		
		return query.getResultList();
	}


}





