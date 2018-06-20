package com.sample;

import java.util.Vector;

public class Paciente {

	private String Nome; //nome do paciente
	private Vector<Nodule> Nodolos; //vetor de modulos do paciente
	private int cirrose;
	private char estadio; //0 = nada, A,B,C,D
	private int VHB;
	private int hepatite_ativa;
	private int historicoCHC; //historico de familiar com chc
	private int HepatiteCronica;
	private int fibroseHipaticaAvançada;
	private int aAguardarTransplanteHepático;
	private int PS_KARNOFSKY;
	private int PS_ECOG;
	private int aptoParaViginalancia;
	
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

	

	public int getCirrose() {
		return cirrose;
	}

	public void setCirrose(int cirrose) {
		this.cirrose = cirrose;
	}

	public char getEstadio() {
		return estadio;
	}

	public void setEstadio(char estadio) {
		this.estadio = estadio;
	}

	public int getVHB() {
		return VHB;
	}

	public void setVHB(int vHB) {
		VHB = vHB;
	}

	public int getHepatite_ativa() {
		return hepatite_ativa;
	}

	public void setHepatite_ativa(int hepatite_ativa) {
		this.hepatite_ativa = hepatite_ativa;
	}

	public int getHistoricoCHC() {
		return historicoCHC;
	}

	public void setHistoricoCHC(int historicoCHC) {
		this.historicoCHC = historicoCHC;
	}

	public int getHepatiteCronica() {
		return HepatiteCronica;
	}

	public void setHepatiteCronica(int hepatiteCronica) {
		HepatiteCronica = hepatiteCronica;
	}

	public int getFibroseHipaticaAvançada() {
		return fibroseHipaticaAvançada;
	}

	public void setFibroseHipaticaAvançada(int fibroseHipaticaAvançada) {
		this.fibroseHipaticaAvançada = fibroseHipaticaAvançada;
	}

	public int getAptoParaViginalancia() {
		return aptoParaViginalancia;
	}

	public void setAptoParaViginalancia(int aptoParaViginalancia) {
		this.aptoParaViginalancia = aptoParaViginalancia;
	}

	
	public int getaAguardarTransplanteHepático() {
		return aAguardarTransplanteHepático;
	}

	public void setaAguardarTransplanteHepático(int aAguardarTransplanteHepático) {
		this.aAguardarTransplanteHepático = aAguardarTransplanteHepático;
	}

	
	public Paciente(String nome) {
		super();
		this.Nome = nome;
		this.cirrose = -1;//
		this.estadio = 'F';//F de nada ainda
		this.VHB = -1;//
		this.hepatite_ativa = -1;//
		this.historicoCHC = -1;//
		this.HepatiteCronica = -1;//
		this.fibroseHipaticaAvançada = -1;//
		this.aAguardarTransplanteHepático =-1;//
		this.aptoParaViginalancia = -1;
		this.PS_ECOG =-1;
		this.PS_KARNOFSKY = -1;
	}

	public int getPS_KARNOFSKY() {
		return PS_KARNOFSKY;
	}

	public void setPS_KARNOFSKY(int pS_KARNOFSKY) {
		PS_KARNOFSKY = pS_KARNOFSKY;
	}

	public int getPS_ECOG() {
		return PS_ECOG;
	}

	public void setPS_ECOG(int pS_ECOG) {
		PS_ECOG = pS_ECOG;
	}

	


}
