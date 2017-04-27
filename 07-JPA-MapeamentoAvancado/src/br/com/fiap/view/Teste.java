package br.com.fiap.view;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemPedidoDAO;
import br.com.fiap.dao.impl.ItemPedidoDaoImpl;
import br.com.fiap.entity.ItemPedido;
import br.com.fiap.entity.Pedido;
import br.com.fiap.entity.Produto;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ItemPedidoDAO dao = new ItemPedidoDaoImpl(em);
		
		Produto produto = new Produto(0, "Pastel", "China");
		Pedido pedido = new Pedido(0, Calendar.getInstance(), Calendar.getInstance(), "Erilandia");
		
		ItemPedido item = new ItemPedido(pedido, produto, 5, 5.50);
		
		try {
			dao.cadastrar(item);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}
		
		
		em.close();
		System.exit(0);
	}

}
