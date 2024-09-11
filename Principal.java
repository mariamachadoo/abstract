package ClasseAbstrata;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro ferrari = new Carro("00000", "F1", "Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.ligar();
		ferrari.frear();
		
		System.out.println("-----------------------------");
		
		Onibus marcopolo = new Onibus("11111","XB1","Prata",2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.ligar();
		marcopolo.frear();
		
		System.out.println("-----------------------------");
		
		Carro2 creta = new Carro2("12345", "F1", "Branco",2021);
		creta.ligar();
		creta.acelerar();
		creta.ligar();
		creta.frear();
		
		System.out.println("-----------------------------");
		
		Moto pcx = new Moto("54321", "F1", "Preta",2020);
		pcx.ligar();
		pcx.acelerar();
		pcx.ligar();
		pcx.frear();
		

	}

}
