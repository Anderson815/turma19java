package exercicios;

import java.util.Scanner;

public class Ex02_Para {
	public static void main(String[] args) {
		
//		Desenvolver um sistema que efetue a soma de todos os números ímpares que são
//		múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		
		Scanner leia = new Scanner(System.in);
		
		int soma = 0;
		
		for(int contador = 1; contador <= 500; contador++) {
			if(contador % 2 == 1 && contador % 3 == 0) soma += contador;
		}
		
		System.out.println("A soma é " + soma);
	}
}
