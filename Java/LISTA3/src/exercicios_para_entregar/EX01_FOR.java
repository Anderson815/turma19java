package exercicios_para_entregar;

import java.util.Scanner;

public class EX01_FOR {

	public static void main(String[] args) {
		
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11
		   obtemos resto = 5. (FOR)
		 */
				
		for(int contador = 1000; contador < 2000; contador++) {
			if(contador%11 == 5) System.out.println(contador);
		}

	}

}
