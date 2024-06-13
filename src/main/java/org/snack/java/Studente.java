package org.snack.java;

public class Studente {

	private String nome;
	private String cognome;
	private int eta;

	public Studente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getInfoStudente() {
		String info = this.nome + " " + this.cognome + " " + this.eta + " " + "anni";
		return info;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

}
