package exercicios;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		double a, b, c, d, e, f, x, y;
		
		//Entrada
		System.out.print("Digite o A: ");
		a = leia.nextDouble();

		System.out.print("Digite o B: ");
		b = leia.nextDouble();

		System.out.print("Digite o C: ");
		c = leia.nextDouble();

		System.out.print("Digite o D: ");
		d = leia.nextDouble();

		System.out.print("Digite o E: ");
		e = leia.nextDouble();

		System.out.print("Digite o F: ");
		f = leia.nextDouble();

		// Processamento
		x = (c * e - b * f)/(a * e - b * d);
		y = (a * f - c * d)/(a * e - b * d);
			
		// Saida
		System.out.printf("\nX: %.2f", x);
		System.out.printf("\nY: %.2f", y);
		
	}
}
