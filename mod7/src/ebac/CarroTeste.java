package ebac;
import java.util.Scanner;
public class CarroTeste 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		Carro carro1 = new Carro("Fiat","Uno",1997);
		Carro carro2 = new Carro("Volkswagen","Fusca",1990);
		
		System.out.printf("O primeiro carro é da marca: %s, como nome de: %s e ano de: %d \n", carro1.getMarca(),carro1.getNome(),carro1.getAno());
		System.out.printf("O segundo é da marca: %s, com nome: %s e ano: %d \n", carro2.getMarca(),carro2.getNome(),carro2.getAno());
		
		System.out.println("Vamos alterar as características do primeiro carro agora! Primeiro pelo nome, depois marca e depois ano");
		System.out.println("Digita!");
		
		String nome = input.nextLine();
		carro1.setNome(nome);
		String marca = input.nextLine();
		carro1.setMarca(marca);
		int ano = input.nextInt();
		carro1.setAno(ano);
		
		mostradorCarro(carro1);
		mostradorCarro(carro2);
	}
	
	public static void mostradorCarro(Carro carrocaracteristicas)
	{
		System.out.printf("nome: %s, a marca é: %s e o ano é: %d \n", carrocaracteristicas.getNome(), carrocaracteristicas.getMarca(), 
		carrocaracteristicas.getAno());
	}

}
