package exercicios;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Vari�veis
		double custoFabrica, custoConsumidor;
		
		//Entrada
		System.out.print("Digite o custo de fabrica��o do carro: ");
		custoFabrica = leia.nextDouble();

		// Processamento
		custoConsumidor = (custoFabrica * 0.28) + (custoFabrica * 0.45) + custoFabrica;
			
		// Saida
		System.out.printf("\nO custo do carro para o consumidor � %.2f", custoConsumidor);
	}
}
