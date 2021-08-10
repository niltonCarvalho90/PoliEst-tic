package Polimorfismo_dinamico;

public class Ave extends Animal{

	private char corDaPena;
	
	public void locomover() {
		System.out.println("Voando");
	}

	public void alimentar() {
		System.out.println("Comendo Frutas");
	}

	public void emitirSom() {
		System.out.println("Som de ave");
	}
	
	public void fazerNinho() {
		System.out.println("Construiu um Ninho");
	}

	public char getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(char corDaPena) {
		this.corDaPena = corDaPena;
	}
	
}
