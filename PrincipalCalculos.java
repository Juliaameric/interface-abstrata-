package interfaceAbstrata;

public class PrincipalCalculos {

	public static void main(String[] args) {
		Calculando calc = new Calculando();//chamando a classe
		
		System.out.println(calc.somar());//system infora o valor
		System.out.println(calc.sub());
		System.out.println(calc.mult());
		System.out.println(calc.div());
		System.out.println(calc.exp());
	}

}
