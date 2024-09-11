package ClasseAbstrata;

public class Gato extends Animal {
	
	public Gato (String nome, String sexo, String raca){
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O gato mia");
	}
	public void caminhar() {
		System.out.println("O gato caminha");
	}	
	public void dormir() {
		System.out.println("O gato dorme");
	}	
	public void correr() {
		System.out.println("O gato corre");
	}

}
