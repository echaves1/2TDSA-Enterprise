package br.com.fiap.view;

import javax.persistence.EntityManager;
import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.impl.ContaDaoImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ContaDAO dao = new ContaDaoImpl(em);
		
		Agencia agencia = new Agencia();
		agencia.setEndereco("Av Lins");
		
		ContaCorrente cc = new ContaCorrente(0, 0, 500, agencia);
		
		try {
			dao.cadastrar(cc);
			dao.salvar();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
		
	}

}
