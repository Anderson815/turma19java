package exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main (String[] args) {
		
//		Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//		em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//		diagonal, ou seja, diagonal principal.
		
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int somaTotal = 0;
		int somaDiagonal = 0;
		
		for(int linha = 0; linha < 3; linha++) {
			System.out.println("Linha " + linha);
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print("\tColuna " + coluna + ": ");
				matriz[linha][coluna] = leia.nextInt();
				
				somaTotal += matriz[linha][coluna];
				if(linha == coluna) somaDiagonal += matriz[linha][coluna];
			}
		}
		
		System.out.println("");
		System.out.println("----- RESULTADOS -----");
		
		System.out.println("Soma de todos os valores da matriz: " + somaTotal);
		System.out.println("Soma dos valores da diagonal principal: " + somaDiagonal);

	}
}
