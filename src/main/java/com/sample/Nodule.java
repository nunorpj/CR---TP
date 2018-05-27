package com.sample;

public class Nodule {

	private int id;//id do nodolo
	private int tamanho; //tamanho
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public Nodule(int id, int tamanho) {
		super();
		this.id = id;
		this.tamanho = tamanho;
	}
	
}
