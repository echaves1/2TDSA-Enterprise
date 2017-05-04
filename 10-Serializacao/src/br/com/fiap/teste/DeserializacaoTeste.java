package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Pessoa;

public class DeserializacaoTeste {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("filePessoa");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Pessoa pessoa = (Pessoa) ois.readObject();
			
		ois.close();
		fis.close();
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
	}

}
