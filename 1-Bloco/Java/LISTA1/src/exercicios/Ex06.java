package exercicios;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Variáveis
		double p1x, p1y, p2x, p2y, d;
		
		//Entrada
		System.out.print("Digite o X do 1º Ponto: ");
		p1x = leia.nextDouble();

		System.out.print("Digite o Y do 1º Ponto: ");
		p1y= leia.nextDouble();;

		System.out.print("Digite o X do 2º Ponto: ");
		p2x = leia.nextDouble();

		System.out.print("Digite o Y do 1º Ponto: ");
		p2y = leia.nextDouble();


		// Processamento
		d = Math.sqrt(Math.pow((p2x - p1x), 2) + Math.pow((p2y - p1y), 2));
			
		// Saida
		System.out.printf("\nA distância é %.2f", d);
	}
}