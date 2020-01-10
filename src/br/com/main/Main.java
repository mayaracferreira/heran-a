package br.com.main;

import br.com.model.*;

public class Main {

	public static void main(String[] args) {
		Carro c1 = new Carro("popular", 10, 5, 0, "honda", 4, 2019);

		Aviao a1 = new Aviao("boing007", 0, 237, 0, "corporativo", "particular");

		c1.status();

		System.out.println("---------------------------------");

		a1.status();
	}

}
