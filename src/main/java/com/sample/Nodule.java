package com.sample;


public class Nodule {
	private float tamanho; //tamanho
	private int  id;
	private int exame;
	
	
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
		this.exame=1;//US
		this.id = id;
	}
	
}
