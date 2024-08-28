package interfaceAbstrata;

public class PrincipalGamer {

	public static void main(String[] args) {
	Computador gamer = new Gamer();
		
	gamer.ligar();
	gamer.desligar();
	gamer.carregamentoSistema();
	gamer.reiniciar();
	}

}
