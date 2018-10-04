package br.com.testews.model;

public class Fruta {
	
	private int id;
	private String nome;
	private String tipo;
	private String fazenda;		
	
	
	public Fruta(int id, String nome, String tipo, String fazenda) {
		super();
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.fazenda = fazenda;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getFazenda() {
		return fazenda;
	}
	
	public void setFazenda(String fazenda) {
		this.fazenda = fazenda;
	}
}
