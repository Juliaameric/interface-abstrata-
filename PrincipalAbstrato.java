package interfaceAbstrata;

public class PrincipalAbstrato {

	public static void main(String[] args) {
		Onibus busao = new Onibus();
		Carro car = new Carro();
		
		System.out.println("bus");
		busao.acelerar();
		busao.frear();
		busao.virar();
		busao.ligar();
		
		System.out.println("*****************************************************************************");
		
		System.out.println("carro");
		car.acelerar();
		car.frear();
		car.virar();
		car.ligar();

	}

}
