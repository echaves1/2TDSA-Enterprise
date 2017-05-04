package br.com.fiap.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.fiap.bo.CambioBO;

public class CambioBoImpl extends UnicastRemoteObject implements CambioBO{

	public CambioBoImpl() throws RemoteException {
		super();
	}

	@Override
	public double converterBitCoinToReal(double bitcoin) throws RemoteException {
		return bitcoin*1300;
	}

}
