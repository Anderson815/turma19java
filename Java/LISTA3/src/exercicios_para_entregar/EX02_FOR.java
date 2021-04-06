package exercicios_para_entregar;

import java.util.Scanner;

public class EX02_FOR {
	public static void main(String[] args) {
	
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		Scanner leia = new Scanner(System.in);

		int numero = 0;
		int par = 0;
		int impar = 0;
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.print("Digite o " + contador + "º número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) par ++;
			else impar++;
		}
		
		System.out.println();
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números impares: " + impar);
	}
}
