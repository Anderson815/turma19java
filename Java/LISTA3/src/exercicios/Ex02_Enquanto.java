package exercicios;

import java.util.Scanner;

public class Ex02_Enquanto {
	public static void main(String[] args) {
		
//		Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
//		três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
//		digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		int novoNumero = 0;
		
		System.out.print("Digite um número para ver a mágica: ");
		numero = leia.nextInt();
		
		novoNumero = numero;
		
		while(novoNumero < 100) {
			System.out.print(novoNumero + "   ");
			novoNumero *= 3;
		}
		
		if(numero < 100) System.out.print(novoNumero);
		else System.out.print("Você já informou um número maior ou igual a 100");

	}
}
