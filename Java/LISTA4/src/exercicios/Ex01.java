package exercicios;

import java.util.Scanner;

public class Ex01 {
	
	public static void main (String[] args) {
		
//		Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//		atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		
		Scanner leia = new Scanner(System.in);
		
		int pontuacao[] = new int[5];
		int maiorPontuacao = 0;
		
		for(int contador = 0; contador < 5; contador++) {
			System.out.print("Digite a " + (contador + 1) + "� pontua��o: ");
			pontuacao[contador] = leia.nextInt();
			
			if(maiorPontuacao < pontuacao[contador]) maiorPontuacao = pontuacao[contador];
		}
		
		System.out.println();
		System.out.println("----- Pontua��es -----");
		
		for(int contador = 0; contador < 5; contador++) {
			System.out.println((contador + 1) + "� pontua��o: " + pontuacao[contador]);
		}
		
		System.out.println();
		System.out.println("Maior pontua��o: " + maiorPontuacao);
		
	}
}
