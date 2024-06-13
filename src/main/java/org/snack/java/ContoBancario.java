package org.snack.java;

public class ContoBancario {

	private int numeroConto;
	private float saldo;

	public ContoBancario(int numeroConto) {

		this.numeroConto = numeroConto;
		this.saldo = 0.0F;
	}

	public void addToConto(float deposito) {
		this.saldo += deposito;

	}

	public void subFromConto(float prelievo) {
		this.saldo += prelievo * -1;

	}

	public float getSaldo() {
		return this.saldo;
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	private void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}

	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
