package interfaceAbstrata;

public class Loboex implements Animalex{
	
	@Override
	public void dormir() {
		System.out.println("dormindo.");
	}
	@Override
	public void caminhar() {
		System.out.println("caminhando.");
	}
	@Override
	public void correr() {
		System.out.println("correndo.");
	}
	@Override
	public void emitirSom() {
		System.out.println("uivando.");
	}
}
