package Polimorfismo_dinamico;

public class Peixe extends Animal {

	private char corEscama; 
	
	public void locomover() {
		System.out.println("Nadando");
	};

	public void alimentar() {
		System.out.println("Comendo subst�ncias");
	};

	public void emitirSom() {
		System.out.println("Peixe n�o faz som");
	}
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	public char getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(char corEscama) {
		this.corEscama = corEscama;
	}
}
