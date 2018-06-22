package com.sample;

import java.util.Vector;

public class HCC {
	private char Stage;// 0 , A,B,C, D, 1 se ainda nao tiver sido avalidado
	private String Tratamento;
	private int N; //para linfonodos. O c�ncer que se espalhou para os linfonodos pr�ximos. Legenda: 1->SIM; 0->N�o; -1->nao avaliado
	private int M; //para met�stase. O c�ncer que se espalhou para partes distantes do organismo. Legenda: 1->SIM; 0->N�o; -1->nao avaliado
	
	
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public int getM() {
		return M;
	}
	public void setM(int m) {
		M = m;
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
	
	

	
	public HCC() {
		super();
		this.Tratamento = "VAZIO";
		this.Stage = '1'; //nada ainda
		this.M= -1;//nao avaliado ainda
		this.N=-1;//nao avaliado ainda
	}
	
	
}


// os nodulos teem de ter o local deles por causa do PNM
/*
A categoria N descreve se o c�ncer se espalhou para os linfonodos vizinhos:

NX significa que os linfonodos n�o podem ser avaliados.
N0 significa que os linfonodos vizinhos n�o cont�m c�ncer. 
Os n�meros que aparecem ap�s o N (por exemplo, N1, N2 e N3) podem descrever o tamanho, localiza��o e/ou o n�mero dos linfonodos com doen�a. Quanto maior o n�mero, mais o c�ncer se espalhou para os linfonodos.

A categoria M descreve se o c�ncer se espalhou (met�stases) para locais distantes do corpo:

M0 significa que nenhuma dissemina��o foi encontrada.
M1 significa que o c�ncer se espalhou para tecidos e �rg�os distantes (met�stases � dist�ncia foram encontradas).
*/