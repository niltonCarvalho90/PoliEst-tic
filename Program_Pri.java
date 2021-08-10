package Polimorfismo_dinamico;

public class Program_Pri {

	public static void main(String[] args) {
		
		Mamifero M = new Mamifero();
		Reptil R = new Reptil();
		Cachorro C = new Cachorro();
		Canguru K = new Canguru();
		
		K.locomover();
		C.emitirSom();
		R.alimentar();
		M.corDoPelo = "Preto";

	}

}
