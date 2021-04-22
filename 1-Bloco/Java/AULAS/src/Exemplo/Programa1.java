package Exemplo;

import java.util.Scanner;

public class Programa1 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int soma;
		
		System.out.print("Escreva o primeiro valor: ");
		valor1 = leitor.nextInt();
		
		System.out.print("Escreva o segundo valor: ");
		valor2 = leitor.nextInt();
		
		soma = valor1 + valor2;
		
		System.out.println("A soma é " + soma);
	}
}
