package exercicios_para_entregar;

import java.util.Scanner;

public class EX02_FOR {
	public static void main(String[] args) {
	
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		
		Scanner leia = new Scanner(System.in);

		int numero = 0;
		int par = 0;
		int impar = 0;
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.print("Digite o " + contador + "� n�mero: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) par ++;
			else impar++;
		}
		
		System.out.println();
		
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros impares: " + impar);
	}
}
