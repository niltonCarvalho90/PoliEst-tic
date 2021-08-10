package Polimorfismo_dinamico;

public class Reptil extends Animal {

	private char corDaEscama;
	
	public void locomover() {
		System.out.println("Rastejando");
	};

	public void alimentar() {
		System.out.println("Comendo vegetais");
	};

	public void emitirSom() {
		System.out.println("Som de Réptil");
	}

	public char getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(char corDaEscama) {
		this.corDaEscama = corDaEscama;
	};
}
