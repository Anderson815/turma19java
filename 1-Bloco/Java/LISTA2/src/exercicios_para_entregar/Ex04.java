package exercicios_para_entregar;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
//		Faça um programa em que permita a entrada de um número qualquer e exiba se este
//		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//		ímpar exiba o número elevado ao quadrado.
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("digite um número: ");
		numero = leia.nextInt();
		
		System.out.println("");
		
		if(numero > 0) {
			
			if(numero % 2 == 0) {
				double raiz = Math.sqrt(numero);
				
				System.out.println("O número " + numero + " é par e a raiz quadrada dele é " + raiz);
			}else {
				double potencia = Math.pow(numero, 2);
				
				System.out.println("O número " + numero + " é impar e esse número ao quadrado é " + potencia);
			}
			
		}else if(numero < 0) System.out.println("ERRO: Número negativo");
		else System.out.println("ERRO: Número 0 é neutro");
	}

}
