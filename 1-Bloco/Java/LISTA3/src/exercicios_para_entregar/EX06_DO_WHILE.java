package exercicios_para_entregar;

import java.util.Scanner;

public class EX06_DO_WHILE {
	public static void main(String[] args) {
		
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
		   final imprimir a média dos números múltiplos de 3. Para sair digitar
		   0(zero).(DO...WHILE)
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		
		double mediaNumerosMultiplos3 = 0;
		int somaNumerosMultiplos3 = 0;
		int quantiaNumerosMultiplos3 = 0;
		
		do {
			
			System.out.print("Digite um número: ");
			numero = leia.nextInt();	
			
			if(numero > 0 && (numero % 3) == 0) {
				somaNumerosMultiplos3 += numero;
				quantiaNumerosMultiplos3++;
			}
			
			
		}while(numero > 0);
		
		mediaNumerosMultiplos3 = (double) somaNumerosMultiplos3 / (double) quantiaNumerosMultiplos3;
		
		System.out.println();
		System.out.print("A média dos múltiplos de 3 é " + mediaNumerosMultiplos3);
	}
}
