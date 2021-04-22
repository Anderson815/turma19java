package exercicios;

import java.util.Scanner;

public class Ex02_Faca_Enquanto {
	public static void main(String[] args) {

//		Faça um programa que pegue um número do teclado e calcule a soma de todos os
//		números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
//		1+2+3+4+5+6+7=28.
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		int contador = 0;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		contador = numero;
		
		do {
			soma += contador;
			contador--;
		}while(contador > 0);
		
		System.out.println("A soma dos número até o valor que você informou é " + soma);
	}
}
