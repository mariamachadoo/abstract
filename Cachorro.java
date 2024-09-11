package ClasseAbstrata;

public class Cachorro extends Animal {
	
	public Cachorro (String nome, String sexo, String raca){
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro uiva");
	}
	public void caminhar() {
		System.out.println("O cachorro caminha");
	}	
	public void dormir() {
		System.out.println("O cachorro dorme");
	}	
	public void correr() {
		System.out.println("O cachorro corre");
	}


}
