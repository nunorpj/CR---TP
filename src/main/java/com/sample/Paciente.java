package com.sample;

import java.util.Vector;

public class Paciente {

	private String Nome; //nome do paciente
	private Vector<Nodule> Nodolos; //vetor de modulos do paciente
	private HCC hcc;
	

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Vector<Nodule> getNodolos() {
		return Nodolos;
	}
	public void addNodolo(Nodule nodolos) {
		Nodolos.add(nodolos);
	}

	
	public Paciente( String nome) {
		super();
		Nome = nome;
		Nodolos = new Vector<>();
		setHcc(null);
	}
	public HCC getHcc() {
		return hcc;
	}
	public void setHcc(HCC hcc) {
		this.hcc = hcc;
	}

}
