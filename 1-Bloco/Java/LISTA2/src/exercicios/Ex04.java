package exercicios;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		String parImpar = "";
		String positivoNegativo = "";
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		System.out.println();
		
		if(numero != 0) {
			
			if(numero % 2 == 0) parImpar = "par";
			else parImpar = "impar";
			
			if(numero > 0) positivoNegativo = "positivo";
			else positivoNegativo = "negativo";
			
			System.out.println("O n�mero " + numero + " � " + parImpar + " e ele � " + positivoNegativo);
			
		}else System.out.println("O n�mero � neutro portanto n�o � poss�vel analisar");
	}
}
