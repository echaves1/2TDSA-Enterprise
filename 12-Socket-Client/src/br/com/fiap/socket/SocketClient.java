package br.com.fiap.socket;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Pessoa;

public class SocketClient {

	public static void main(String[] args) throws Exception {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Eri");
		pessoa.setIdade(19);
		
		Socket socket = new Socket("127.0.0.1", 1234);
		
		ObjectOutputStream oos  = new ObjectOutputStream(socket.getOutputStream());
		oos.writeObject(pessoa);
		
		System.out.println("Pessoa Serializada");
		
		socket.close();
		oos.close();
	}

}
