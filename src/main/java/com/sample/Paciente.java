package com.sample;

import java.util.Vector;

public class Paciente {

	private int Id; //id do paciente(atribuir automaticamente)
	private String Nome; //nome do paciente
	private Vector<Nodule> Nodolos; //vetor de modulos do paciente
	private int Id_Exame; // id do exame // 0 se nao tiver exame
	
	
	public int getId_Exame() {
		return Id_Exame;
	}
	public void setId_Exame(int id_Exame) {
		Id_Exame = id_Exame;
	}
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

	
	public Paciente(int id, String nome) {
		super();
		Id = id;
		Nome = nome;
		Nodolos = new Vector<>();
		Id_Exame = 0;
	}

}
