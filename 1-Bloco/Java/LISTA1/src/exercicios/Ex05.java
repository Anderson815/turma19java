package exercicios;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//Vari�veis
		double nota1, nota2, nota3, mediaPonderada;

		//Entrada
		System.out.print("Digite o valor 1� nota: ");
		nota1 = leia.nextDouble();

		System.out.print("Digite o valor 2� nota: ");
		nota2 = leia.nextDouble();

		System.out.print("Digite o valor 3� nota: ");
		nota3 = leia.nextDouble();

		// Processamento
		mediaPonderada = (2 * nota1 + 3 * nota2 + 5 * nota3)/10;
			
		// Saida
		System.out.printf("\nA m�dia � %.2f", mediaPonderada);		
		
	}
}
