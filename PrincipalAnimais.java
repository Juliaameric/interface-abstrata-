package interfaceAbstrata;

public class PrincipalAnimais {

	public static void main(String[] args) {
		Lobo lombinho = new Lobo();
		Leao simba = new Leao();
		Tigre rajado = new Tigre();
		Cachorro coto = new Cachorro();
		Gato linguado = new Gato();
		
		lombinho.setNome("Arrombadinho");
		lombinho.setSexo("M");
		lombinho.setRaca("Vermelho");
		lombinho.dormir();
		lombinho.caminhar();
		lombinho.correr();
		lombinho.emitirSom();
		System.out.println(lombinho.getNome());
		System.out.println(lombinho.getSexo());
		System.out.println(lombinho.getRaca());
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		simba.setNome("leoloro");
		simba.setSexo("M");
		simba.setRaca("rajado");
		simba.dormir();
		simba.caminhar();
		simba.emitirSom();
		System.out.println(simba.getNome());
		System.out.println(simba.getSexo());
		System.out.println(simba.getRaca());
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		rajado.setNome("titi");
		rajado.setSexo("F");
		rajado.setRaca("avermelhado");
		rajado.dormir();
		rajado.caminhar();
		rajado.correr();
		rajado.emitirSom();
		System.out.println(rajado.getNome());
		System.out.println(rajado.getSexo());
		System.out.println(rajado.getRaca());
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		coto.setNome("latimudo");
		coto.setSexo("F");
		coto.setRaca("pitmonster");
		coto.dormir();
		coto.caminhar();
		coto.correr();
		coto.emitirSom();
		System.out.println(coto.getNome());
		System.out.println(coto.getSexo());
		System.out.println(coto.getRaca());
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		linguado.setNome("arreapiado");
		linguado.setSexo("F");
		linguado.setRaca("persa");
		linguado.dormir();
		linguado.caminhar();
		linguado.correr();
		linguado.emitirSom();
		System.out.println(linguado.getNome());
		System.out.println(linguado.getSexo());
		System.out.println(linguado.getRaca());
	}

}
