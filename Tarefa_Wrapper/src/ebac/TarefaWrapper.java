package ebac;
import java.util.Scanner;

/**
 * Este programa demonstra um casting explícito.
 * A variável original é uma primitiva do tipo inteiro.
 * Tal é convertida para uma outra variável do tipo Wrapper.
 * @author Cassiano
 *
 */

public class TarefaWrapper 
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		int a;
		Integer b;
		
		System.out.println("Por favor, digite um valor.");
		a = input.nextInt();
		
		b = (Integer) a;
		
		System.out.printf("O valor convertido para Wrapper ficou: %d", b);
	}
}
