package org.snack.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Studente stud1 = new Studente("pippo", "franco", 15);
//
//		System.out.println(stud1.getInfoStudente());

		ContoBancario conto = new ContoBancario(1);

		System.out.println(conto.getSaldo());

		conto.addToConto(5.0f);
		System.out.println(conto.getSaldo());

		conto.subFromConto(3.0f);
		System.out.println(conto.getSaldo());

		conto.addToConto(5.0f);
		System.out.println(conto.getSaldo());
	}

}
