package interfaceAbstrata;

public class Gamer implements Computador{
	@Override
	public void ligar() {
		System.out.println("computador ligado.");
	}
	@Override
	public void reiniciar() {
		System.out.println("computador reiniciando.");
	}
	@Override
	public void desligar() {
		System.out.println("computador desligado");
	}
	@Override
	public void carregamentoSistema() {
		System.out.println("carregando sistema.");
	}
}
