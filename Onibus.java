package interfaceAbstrata;

public class Onibus extends VeiculosAbs {

	@Override
	public void acelerar() {
	System.out.println("acelerar bus");
}

	@Override
	public void frear() {
	System.out.println("frear bus");
	}

	@Override
	public void virar() {
	System.out.println("virar bus");
}

	@Override
	public void ligar() {
	System.out.println("ligar bus");
}
}