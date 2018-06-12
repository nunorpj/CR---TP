package com.sample;

import java.util.Vector;

public class HCC {
	private int id;
	private char Stage;
	private String Tratamento;
	private Vector<Nodule> Nodolos; //vetor de modulos do paciente

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getStage() {
		return Stage;
	}
	public void setStage(char stage) {
		Stage = stage;
	}
	public String getTratamento() {
		return Tratamento;
	}
	public void setTratamento(String tratamento) {
		Tratamento = tratamento;
	}
	
	
	
	public Vector<Nodule> getNodolos() {
		return Nodolos;
	}
	
	public void addNodolos(Nodule nodolo) {
		Nodolos.add(nodolo);
	}
	
	public HCC() {
		super();
		Tratamento = null;
		Nodolos = new Vector<>(); 
	}
	
	
}
