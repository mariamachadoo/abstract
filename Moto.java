package ClasseAbstrata;

public class Moto extends Veiculos {
	
	public Moto(String placa, String modelo, String cor, int ano) {
		super (placa, modelo, cor, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println("A moto está acelerando.");
	}
	public void frear() {
		System.out.println("A moto está freando.");
	}
	public void virar() {
		System.out.println("A moto está virando.");
	}
	public void ligar() {
		System.out.println("A moto está ligado.");
	}
}



