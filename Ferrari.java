package interfaceAbstrata;

public class Ferrari implements Veiculo {
	@Override
	public void ligar() {
		System.out.println("veiculo ligado.");
	}
	@Override
	public void desligar() {
		System.out.println("veiculo desligado.");
	}
	@Override
	public void manobrar() {
		System.out.println("manobrando.");
	}
	@Override
	public void engatar() {
		System.out.println("veiculo engatado.");
	}
	@Override
	public void acelerar() {
		System.out.println("acelerando.");
	}
	@Override
	public void frear() {
		System.out.println("veiculo freando.");
	}
	
}
