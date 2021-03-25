package exercicios;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//Variáveis
		double nota1, nota2, nota3, mediaPonderada;

		//Entrada
		System.out.print("Digite o valor 1ª nota: ");
		nota1 = leia.nextDouble();

		System.out.print("Digite o valor 2ª nota: ");
		nota2 = leia.nextDouble();

		System.out.print("Digite o valor 3ª nota: ");
		nota3 = leia.nextDouble();

		// Processamento
		mediaPonderada = (2 * nota1 + 3 * nota2 + 5 * nota3)/10;
			
		// Saida
		System.out.printf("\nA média é %.2f", mediaPonderada);		
		
	}
}
