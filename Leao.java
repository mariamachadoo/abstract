package ClasseAbstrata;

public class Leao extends Animal {
	
	public Leao(String nome, String sexo, String raca){
		super(nome, sexo, raca);
	}
	
	@@Override
	public void emitirSom() {
		System.out.println("O leao uiva");
	}
	public void caminhar() {
		System.out.println("O leao caminha");
	}	
	public void dormir() {
		System.out.println("O leao dorme");
	}	
	public void correr() {
		System.out.println("O leao corre");
	}
}

