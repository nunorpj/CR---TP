package com.sample;

import java.util.Vector;

public class Paciente {

	private String Nome; //nome do paciente
	private Vector<Nodule> Nodolos; //vetor de modulos do paciente
	private boolean cirrose;
	private char estadio; //0 = nada, A,B,C,D
	private boolean VHB;
	private boolean hepatite_ativa;
	private boolean historicoCHC; //historico de familiar com chc
	private boolean HepatiteCronica;
	private boolean fibroseHipaticaAvançada;
	private boolean aptoParaViginalancia;
	
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

	public boolean isCirrose() {
		return cirrose;
	}

	public void setCirrose(boolean cirrose) {
		this.cirrose = cirrose;
	}

	public char getEstadio() {
		return estadio;
	}

	public void setEstadio(char estadio) {
		this.estadio = estadio;
	}

	public boolean isVHB() {
		return VHB;
	}

	public void setVHB(boolean vHB) {
		VHB = vHB;
	}

	public boolean isHepatite_ativa() {
		return hepatite_ativa;
	}

	public void setHepatite_ativa(boolean hepatite_ativa) {
		this.hepatite_ativa = hepatite_ativa;
	}

	public boolean isHistoricoCHC() {
		return historicoCHC;
	}

	public void setHistoricoCHC(boolean historicoCHC) {
		this.historicoCHC = historicoCHC;
	}

	public boolean isHepatiteCronica() {
		return HepatiteCronica;
	}

	public void setHepatiteCronica(boolean hepatiteCronica) {
		HepatiteCronica = hepatiteCronica;
	}

	public boolean isFibroseHipaticaAvançada() {
		return fibroseHipaticaAvançada;
	}

	public void setFibroseHipaticaAvançada(boolean fibroseHipaticaAvançada) {
		this.fibroseHipaticaAvançada = fibroseHipaticaAvançada;
	}

	
	
	public boolean isAptoParaViginalancia() {
		return aptoParaViginalancia;
	}

	public void setAptoParaViginalancia(boolean aptoParaViginalancia) {
		this.aptoParaViginalancia = aptoParaViginalancia;
	}

	public Paciente(String nome, boolean cirrose, char estadio, boolean vHB, boolean hepatite_ativa,
			boolean historicoCHC, boolean hepatiteCronica, boolean fibroseHipaticaAvançada) {
		super();
		this.Nome = nome;
		this.cirrose = cirrose;
		this.estadio = estadio;
		this.VHB = vHB;
		this.hepatite_ativa = hepatite_ativa;
		this.historicoCHC = historicoCHC;
		this.HepatiteCronica = hepatiteCronica;
		this.fibroseHipaticaAvançada = fibroseHipaticaAvançada;
		this.aptoParaViginalancia = false;
	}

	


}
