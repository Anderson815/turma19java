package exercicios;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Vari�veis
		double p1x, p1y, p2x, p2y, d;
		
		//Entrada
		System.out.print("Digite o X do 1� Ponto: ");
		p1x = leia.nextDouble();

		System.out.print("Digite o Y do 1� Ponto: ");
		p1y= leia.nextDouble();;

		System.out.print("Digite o X do 2� Ponto: ");
		p2x = leia.nextDouble();

		System.out.print("Digite o Y do 1� Ponto: ");
		p2y = leia.nextDouble();


		// Processamento
		d = Math.sqrt(Math.pow((p2x - p1x), 2) + Math.pow((p2y - p1y), 2));
			
		// Saida
		System.out.printf("\nA dist�ncia � %.2f", d);
	}
}