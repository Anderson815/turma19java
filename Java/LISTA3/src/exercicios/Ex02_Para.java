package exercicios;

import java.util.Scanner;

public class Ex02_Para {
	public static void main(String[] args) {
		
//		Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
//		m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
		
		Scanner leia = new Scanner(System.in);
		
		int soma = 0;
		
		for(int contador = 1; contador <= 500; contador++) {
			if(contador % 2 == 1 && contador % 3 == 0) soma += contador;
		}
		
		System.out.println("A soma � " + soma);
	}
}
