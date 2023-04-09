package ebac;
/**
 * Este programa lê quatro valores pré-definidos e calcula a média entre esses.
 * @author Cassiano Luís Bourscheid
 *
 * @param args
 */

public class TarefaMediaCalculo8 
{
	public static void main(String [] args)
	{
		postulandoValoresEContas();
	}
	
	public static void postulandoValoresEContas()
	{
		int num1 = 10;
		int num2 = 20;
		int num3 = 90;
		int num4 = 70;
		double media;
		
		int somatorio  = num1 + num2 + num3 + num4;
		media = (double) somatorio /4;
		System.out.printf("O valor encontrado resulta em: %.2f",media);
	}
	
}

