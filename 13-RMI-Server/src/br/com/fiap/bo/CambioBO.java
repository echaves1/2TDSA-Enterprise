package br.com.fiap.bo;

import java.rmi.RemoteException;

public interface CambioBO {

	double converterBitCoinToReal(double bitcoin) throws RemoteException;
	
	
}
