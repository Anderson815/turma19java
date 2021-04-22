package exercicios_para_entregar;

import java.util.Scanner;

public class EX05_DO_WHILE {
	public static void main(String[] args) {
		
		/*
		 * Crie um programa que leia um número do teclado até que encontre um
		   número igual a zero. No final, mostre a soma dos números
		   digitados.(DO...WHILE)
		 */
		
		Scanner leia = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		
		do {
			
			System.out.print("Digite um número: ");
			numero = leia.nextInt();	
			
			soma += numero;
			
		}while(numero != 0);
		
		System.out.println();
		System.out.print("A soma de todos os valores é " + soma);
	}
}
