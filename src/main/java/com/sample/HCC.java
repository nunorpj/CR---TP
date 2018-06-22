package com.sample;

import java.util.Vector;

public class HCC {
	private char Stage;// 0 , A,B,C, D, 1 se ainda nao tiver sido avalidado
	private String Tratamento;
	private int N; //para linfonodos. O câncer que se espalhou para os linfonodos próximos. Legenda: 1->SIM; 0->Não; -1->nao avaliado
	private int M; //para metástase. O câncer que se espalhou para partes distantes do organismo. Legenda: 1->SIM; 0->Não; -1->nao avaliado
	
	
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
A categoria N descreve se o câncer se espalhou para os linfonodos vizinhos:

NX significa que os linfonodos não podem ser avaliados.
N0 significa que os linfonodos vizinhos não contêm câncer. 
Os números que aparecem após o N (por exemplo, N1, N2 e N3) podem descrever o tamanho, localização e/ou o número dos linfonodos com doença. Quanto maior o número, mais o câncer se espalhou para os linfonodos.

A categoria M descreve se o câncer se espalhou (metástases) para locais distantes do corpo:

M0 significa que nenhuma disseminação foi encontrada.
M1 significa que o câncer se espalhou para tecidos e órgãos distantes (metástases à distância foram encontradas).
*/