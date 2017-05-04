package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Pessoa;

public class SocketServer {

	//Ler objeto enviado pela rede (socket)
	public static void main(String[] args) throws Exception {
		
		System.out.println("Aguardando......");
		ServerSocket server = new ServerSocket(1234);
		Socket socket = server.accept();
		
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		
		Pessoa pessoa = (Pessoa) ois.readObject();
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		
		ois.close();
	}
	
}
