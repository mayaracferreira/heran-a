package br.com.model;

public class Aviao extends Veiculo {

	//atributos
	private String tipo;
	private String uso;
	
	
	//construtores 
	
	public Aviao(String modelo, int velocidade, int passageiros, int combustivel, String tipo, String uso) {
		super(modelo, velocidade, passageiros, combustivel);
		
		this.tipo = tipo;
		this.uso = uso;	
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getUso() {
		return uso;
	}


	public void setUso(String uso) {
		this.uso = uso; 
	
	
	super.status(); {
		System.out.println("Tipo de avião: " + this.tipo);
		System.out.println("Uso do avião: " + this.uso);
		
	}
	
}
}

