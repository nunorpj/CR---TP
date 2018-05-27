package com.sample;

public class HCC {
	private int id;
	private String Stage;
	private String Tratamento;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStage() {
		return Stage;
	}
	public void setStage(String stage) {
		Stage = stage;
	}
	public String getTratamento() {
		return Tratamento;
	}
	public void setTratamento(String tratamento) {
		Tratamento = tratamento;
	}
	public HCC(int id, String stage) {
		super();
		this.id = id;
		Stage = stage;
		Tratamento = null;
	}
	
	
}
