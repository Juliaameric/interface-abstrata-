package interfaceAbstrata;

public class Calculando implements Calculos{//mostra que esta relacionado com a interface 
	@Override
	public double somar() {
		
		return 10+10;
	}
	@Override//abstrato
	public double sub() {
		
		return 20-20;
	}
	@Override
	public double mult() {
		
		return 4*5;
	}
	@Override
	public int div() {
		
		return 20/5;
	}
	@Override
	public int exp() {
		
		return 2*2;
	}
}


