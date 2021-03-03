package PooTesteCarro;

public class TesteCarro {

	public static void main ( String args [])
	{
		Carro Meucarro = new Carro ();
		Meucarro.cor = "Vermelho";
		Meucarro.modelo = "Volvo";
		Meucarro.velocidadeAtual = 0;
		Meucarro.velocidadeMaxima = 80;
		
		Meucarro.ligar();
		Meucarro.acelera(30);
		
		System.out.println(Meucarro.velocidadeAtual);
		
		
		
		
		
		}
}


	