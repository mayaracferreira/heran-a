package br.com.model;

public class Carro extends Veiculo  {
	 
	//atributos
	private String marca;
	private int portas;
	private int ano;
	
	//construtores

	public Carro(String modelo, int velocidade, int passageiros, int combustivel, String marca, int portas, int ano) {
		super(modelo, velocidade, passageiros, combustivel);
		
		this.marca = marca;
		this.portas = portas;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;

	
		super.status ();
		System.out.println("Marca do carro: " + this.marca);
		System.out.println("Quantidade de portas: " + this.portas);
		System.out.println("Ano do carro: "+ this.ano);
		
	
	
  
}

}
