package br.com.fiap.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.impl.CambioBoImpl;

public class RmiServer {

	public static void main(String[] args) throws Exception {
		
		Registry registry = LocateRegistry.createRegistry(123);
		registry.bind("churos", new CambioBoImpl());
		
	}
}
