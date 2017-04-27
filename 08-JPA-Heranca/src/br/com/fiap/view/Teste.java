package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoDaoImpl;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.entity.Sexo;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
	
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		PessoaDAO dao = new PessoDaoImpl(em);
		PessoaFisica pf = new PessoaFisica("Eri", "PQP", 4793883, Sexo.FEMININO);
		PessoaJuridica pj = new PessoaJuridica("Natura", "SLA", 123456, "NATURALIZANDO");
		
		try {
			dao.cadastrar(pj);
			dao.cadastrar(pf);
			dao.salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
		
	}
}
