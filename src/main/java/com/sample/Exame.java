package com.sample;

public class Exame {

	private int id;
	private String Designacao; //nome do exame
	private String Resultado; //resultado do exame
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignacao() {
		return Designacao;
	}
	public void setDesignacao(String designacao) {
		Designacao = designacao;
	}
	public String getResultado() {
		return Resultado;
	}
	public void setResultado(String resultado) {
		Resultado = resultado;
	}
	public Exame(int id, String designacao) {
		super();
		this.id = id;
		Designacao = designacao;
		Resultado = null;
	}
	
	
}
