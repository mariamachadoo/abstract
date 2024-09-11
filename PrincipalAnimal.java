package ClasseAbstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lobo Loboo = new Lobo("Toddy","macho","lobo cinzento");
		Loboo.emitirSom();
		Loboo.dormir();
		Loboo.caminhar();
		Loboo.correr();
		
		System.out.println("-----------------------------");
		
		Leao Leaoo = new Leao("Toddy","macho","lobo cinzento");
		Leaoo.emitirSom();
		Leaoo.dormir();
		Leaoo.caminhar();
		Leaoo.correr();
		
       System.out.println("-----------------------------");
		
		Tigre Tigree = new Tigre("Toddy","macho","lobo cinzento");
		Tigree.emitirSom();
		Tigree.dormir();
		Tigree.caminhar();
		Tigree.correr(); 
		
        System.out.println("-----------------------------");
		
		Cachorro Cachorroo = new Cachorro("Toddy","macho","lobo cinzento");
		Cachorroo.emitirSom();
		Cachorroo.caminhar();
		Cachorroo.correr();
		Cachorroo.dormir(); 
		
       System.out.println("-----------------------------");
		
		Gato Gatoo = new Gato("Toddy","macho","lobo cinzento");
		Gatoo.emitirSom();
		Gatoo.caminhar();
		Gatoo.correr();
		Gatoo.dormir(); 


	}

}
