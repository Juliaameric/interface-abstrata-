package interfaceAbstrata;

public class Carro extends VeiculosAbs {
	
	@Override
	public void acelerar() {
	System.out.println("acelerar");
}

	@Override
	public void frear() {
	System.out.println("frear");
	}

	@Override
	public void virar() {
	System.out.println("virar");
}

	@Override
	public void ligar() {
	System.out.println("ligar");
}
}