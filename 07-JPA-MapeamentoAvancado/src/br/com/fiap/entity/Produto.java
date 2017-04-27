package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="seqProduto", sequenceName="SEQ_PRODUTO", allocationSize=1)
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqProduto")
	@Column(name="CD_CODIGO")
	private int codigo;
	
	@Column(nullable=false, name="NM_PRUTODO")
	private String nome;
	
	@Column(nullable=false, name="DS_FABRICANTE")
	private String fabricante;
	

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produto(int codigo, String nome, String fabricante) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.fabricante = fabricante;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
