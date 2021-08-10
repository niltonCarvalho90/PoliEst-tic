package Polimorfismo_dinamico;

public class Mamifero extends Animal {

	public String corDoPelo;

	public void locomover() {
		System.out.println("Correndo");
	}

	public void alimentar() {
		System.out.println("Mamando");
	}

	public void emitirSom() {
		System.out.println("Som de mamífero");
	}

}
