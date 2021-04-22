package exercicios;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		double a, b, c, d, r, s;

		//Entrada
		System.out.print("Digite o valor A: ");
		a = leia.nextDouble();

		System.out.print("Digite o valor B: ");
		b = leia.nextDouble();

		System.out.print("Digite o valor C: ");
		c = leia.nextDouble();

		// Processamento
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		d = (r + s)/2;
				
		// Saida
		System.out.print("\nO valor do calculo é " + d);
	}
}