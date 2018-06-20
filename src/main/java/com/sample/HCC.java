package com.sample;

import java.util.Vector;

public class HCC {
	private int id;
	private char Stage;
	private String Tratamento;
	private Vector<Nodule> Nodolos; //vetor de modulos do paciente
	private int N; //para linfonodos. O câncer que se espalhou para os linfonodos próximos. 
	private int M; //para metástase. O câncer que se espalhou para partes distantes do organismo.
	
	
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


// os nodulos teem de ter o local deles por causa do PNM
/*
A categoria N descreve se o câncer se espalhou para os linfonodos vizinhos:

NX significa que os linfonodos não podem ser avaliados.
N0 significa que os linfonodos vizinhos não contêm câncer. 
Os números que aparecem após o N (por exemplo, N1, N2 e N3) podem descrever o tamanho, localização e/ou o número dos linfonodos com doença. Quanto maior o número, mais o câncer se espalhou para os linfonodos.

A categoria M descreve se o câncer se espalhou (metástases) para locais distantes do corpo:

M0 significa que nenhuma disseminação foi encontrada.
M1 significa que o câncer se espalhou para tecidos e órgãos distantes (metástases à distância foram encontradas).
*/