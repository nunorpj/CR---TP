package com.sample;

import java.util.Vector;

public class Paciente {

	private int Id; //id do paciente(atribuir automaticamente)
	private String Nome; //nome do paciente
	private Vector<Nodule> Nodolos; //vetor de modulos do paciente
	private int HCC; // se tiver HCC add id do mesmo, senao 0;

	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

	public Vector<Nodule> getNodolos() {
		return Nodolos;
	}
	public void setNodolos(Vector<Nodule> nodolos) {
		Nodolos = nodolos;
	}
	public int getHCC() {
		return HCC;
	}
	public void setHCC(int hCC) {
		HCC = hCC;
	}
	
	
	public Paciente(int id, String nome) {
		super();
		Id = id;
		Nome = nome;
		Nodolos = new Vector<>();
		HCC = 0;
	}

}
