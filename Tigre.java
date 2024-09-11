package ClasseAbstrata;

public class Tigre extends Animal{
	
	public Tigre(String nome, String sexo, String raca){
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O tigre uiva");
	}
	public void caminhar() {
		System.out.println("O tigre caminha");
	}	
	public void dormir() {
		System.out.println("O tigre dorme");
	}	
	public void correr() {
		System.out.println("O tigre corre");
	}

}
