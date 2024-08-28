package interfaceAbstrata;

public class Home implements Computador{
	@Override
	public void ligar() {
		System.out.println("ligado.");
	}
	@Override
	public void reiniciar() {
		System.out.println("reiniciando.");
	}
	@Override
	public void desligar() {
		System.out.println("desligado");
	}
	@Override
	public void carregamentoSistema() {
		System.out.println("carregando sistema.");
	}
}