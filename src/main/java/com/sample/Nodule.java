package com.sample;


public class Nodule {
	private float tamanho; //tamanho
	private int  id;
	private int exame;
	private String local;// os nodulos teem de ter o local deles por causa do PNM
	//Org�os mais pr�ximos do figado, considerando apenas 3: Vis�cula,Estomago, P�ncreas
	
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
