package br.com.model;

public class Veiculo {

	// atributos
	private String modelo;
	private int velocidade;
	private int passageiros;
	private int combustivel;

	// construtores

	public Veiculo(String modelo, int velocidade, int passageiros, int combustivel) {

		this.modelo = modelo;
		this.velocidade = velocidade;
		this.passageiros = passageiros;
		this.combustivel = combustivel;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	public void status() {

		System.out.println("Veículo modelo: " + this.modelo);
		System.out.println("velocidade do veiculo: " + this.velocidade);
		System.out.println("Quantidade de passageiros: " + this.passageiros);
		System.out.println("Quantidade de combustivel: " + this.combustivel);

	}
}
