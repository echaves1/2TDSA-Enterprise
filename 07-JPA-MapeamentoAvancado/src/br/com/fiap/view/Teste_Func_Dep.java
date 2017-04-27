package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.impl.DependenteDaoImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class Teste_Func_Dep {

	public static void main(String[] args) {

	EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	DependenteDAO dao  = new DependenteDaoImpl(em);
	
	Funcionario func = new Funcionario(0, "Attos");
	func.setSalario(3000);
	func.setNumeroConta("123456789");
	Dependente dep = new Dependente(func, "Erilandia");
	
	try {
		
		dao.cadastrar(dep);
		dao.salvar();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	}

}
