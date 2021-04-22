package exercicios;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0;
		String parImpar = "";
		String positivoNegativo = "";
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		System.out.println();
		
		if(numero != 0) {
			
			if(numero % 2 == 0) parImpar = "par";
			else parImpar = "impar";
			
			if(numero > 0) positivoNegativo = "positivo";
			else positivoNegativo = "negativo";
			
			System.out.println("O número " + numero + " é " + parImpar + " e ele é " + positivoNegativo);
			
		}else System.out.println("O número é neutro portanto não é possível analisar");
	}
}
