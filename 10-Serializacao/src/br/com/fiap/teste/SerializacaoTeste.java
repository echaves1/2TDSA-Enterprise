package br.com.fiap.teste;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Pessoa;

public class SerializacaoTeste {

	public static void main(String[] args) throws Exception {

		Pessoa pessoa = new Pessoa("Rita", 30);
		
		FileOutputStream fos = new FileOutputStream("filePessoa");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(pessoa);
		oos.close();
		fos.close();
		System.out.println("Objeto serializado");
	}

}
