package com.sample;


public class Nodule {
	private float tamanho; //tamanho
	private int  id;
	private int exame;
	private String local;// os nodulos teem de ter o local deles por causa do PNM
	//Orgãos mais próximos do figado, considerando apenas 3: Visícula,Estomago, Pâncreas
	
	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getExame() {
		return exame;
	}

	public void setExame(int exame) {
		this.exame = exame;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	public Nodule(int id) {
		super();
		this.exame=0;//US
		this.id = id;
	}
	
}
